/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author valmir.conque
 */

// Mercadoria com maior quantidade de transações financeiras.
public class Informacao4 {
    
    public static class MapperInformacao4 extends Mapper<Object, Text, Text, IntWritable> {
        private final static IntWritable ocorrencia = new IntWritable(1);
        private final Text chaveMap = new Text();
        
        @Override
        public void map(Object chave, Text valor, Context context) throws IOException, InterruptedException {
            String linha = valor.toString();
            String[] campos = linha.split(";");
            
            if (campos.length == 10) {
                String mercadoria = campos[3].trim();
                chaveMap.set(mercadoria);
                context.write(chaveMap, ocorrencia);
            }
        }
    }

    public static class ReducerInformacao4 extends Reducer<Text, IntWritable, Text, IntWritable> {
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
            context.write(new Text("Mercadoria com mais transações financeiras:"), maxTransacoes);
            context.write(mercadoriaMaisTransacoes, maxTransacoes);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        String arquivoEntrada = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/base_100_mil.csv";
        String arquivoSaida = "/Users/valmirfilho/NetBeansProjects/implementacaoMapReduce/src/main/java/mycompany/implementacaomapreduce/informacao4";
        
        if (args.length == 2) {
            arquivoEntrada = args[0];
            arquivoSaida = args[1];
        }
        
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "informacao4");
        job.setJarByClass(Informacao4.class);
        job.setMapperClass(MapperInformacao4.class);
        job.setReducerClass(ReducerInformacao4.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(arquivoEntrada));
        FileOutputFormat.setOutputPath(job, new Path(arquivoSaida));
        job.waitForCompletion(true);
    }
}
