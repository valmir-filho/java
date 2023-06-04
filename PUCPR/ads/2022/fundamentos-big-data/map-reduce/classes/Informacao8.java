package mycompany.implementacaomapreduce;

// Imports.
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// Mercadoria com maior total de peso, de acordo com todas as transações comerciais, separadas por ano.

public class Informacao8 {
    public static class MapperInformacao8 extends Mapper<Object, Text, Text, LongWritable> {
        
        @Override
        public void map(Object chave, Text valor, Context context) throws IOException, InterruptedException {
            String Linha = valor.toString();
            String[] campos = Linha.split(";");
            LongWritable valorMap = new LongWritable(0);
            
            if(campos.length == 10){
                String mercadoria = campos[3];
                String peso = campos[6];
                String ano = campos[1];
                Text ChaveMap = new Text(ano + " " + mercadoria);
                
                try {
                    valorMap = new LongWritable(Long.parseLong(peso));
                } catch(NumberFormatException e) {
                } finally {
                }
                    
                context.write(ChaveMap, valorMap);
            }
        }
    }
    
    public static class ReducerInformacao8 extends Reducer<Text, LongWritable, Text, LongWritable> {
        
        @Override
        public void reduce(Text chave, Iterable<LongWritable> valores, Context context) throws IOException, InterruptedException {
            long soma = 0;
            for (LongWritable val : valores) {
                soma += val.get();
            }
            
            LongWritable valorSaida = new LongWritable(soma);
            context.write(chave, valorSaida);
        }
    }
               
    public static void main(String[]args) throws IOException, ClassNotFoundException, InterruptedException {
        String arquivoEntrada = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/base_100_mil.csv";
        String arquivoSaida = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/informacao8";
        
        if (args.length == 2) {
            arquivoEntrada = args[0];
            arquivoSaida = args[1];
            
        }
        
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "informacao8");
        job.setJarByClass(Informacao8.class);
        job.setMapperClass(MapperInformacao8.class);
        job.setReducerClass(ReducerInformacao8.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
        FileInputFormat.addInputPath(job, new Path(arquivoEntrada));
        FileOutputFormat.setOutputPath(job, new Path(arquivoSaida));
        job.waitForCompletion(true);
    }        
}
