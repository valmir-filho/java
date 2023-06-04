package mycompany.implementacaomapreduce;

// Imports.
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// Mercadoria com maior quantidade de transações financeiras em 2016.

public class Informacao5 {
    
    public static class MapperInformacao5 extends Mapper<Object, Text, Text, IntWritable> {
        private final static IntWritable ocorrencia = new IntWritable(1);
        private final Text chaveMap = new Text();
        
        @Override
        public void map(Object chave, Text valor, Context context) throws IOException, InterruptedException {
            String linha = valor.toString();
            String[] campos = linha.split(";");
            
            if (campos.length == 10 && campos[1].equals("2016")) {
                String mercadoria = campos[5].trim();
                chaveMap.set(mercadoria);
                context.write(chaveMap, ocorrencia);
            }
        }
    }

    public static class ReducerInformacao5 extends Reducer<Text, IntWritable, Text, IntWritable> {
        private final Text mercadoriaMaisTransacoes = new Text();
        private final IntWritable maxTransacoes = new IntWritable(0);

        @Override
        public void reduce(Text chave, Iterable<IntWritable> valores, Context context)
                throws IOException, InterruptedException {
            int soma = 0;
            
            for (IntWritable val : valores) {
                soma += val.get();
            }
            
            if (soma > maxTransacoes.get()) {
                maxTransacoes.set(soma);
                mercadoriaMaisTransacoes.set(chave);
            }
            
            context.write(chave, new IntWritable(soma));
        }

        @Override
        public void cleanup(Context context) throws IOException, InterruptedException {
            context.write(new Text("Mercadoria com mais transações financeiras em 2016:"), maxTransacoes);
            context.write(mercadoriaMaisTransacoes, maxTransacoes);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        String arquivoEntrada = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/base_100_mil.csv";
        String arquivoSaida = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/informacao5";
        
        if (args.length == 2) {
            arquivoEntrada = args[0];
            arquivoSaida = args[1];
        }
        
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "informacao5");
        job.setJarByClass(Informacao5.class);
        job.setMapperClass(MapperInformacao5.class);
        job.setReducerClass(ReducerInformacao5.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(arquivoEntrada));
        FileOutputFormat.setOutputPath(job, new Path(arquivoSaida));
        job.waitForCompletion(true);
    }
}