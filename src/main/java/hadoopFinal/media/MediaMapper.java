package hadoopFinal.media;

import java.io.IOException;

import hadoopFinal.model.Site;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MediaMapper extends Mapper<LongWritable, Text,Text,Site>{
	private static final LongWritable ONE = new LongWritable(1);
	
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, Site>.Context context) throws IOException,
			InterruptedException {
		String line = value.toString().toLowerCase().replaceAll("\t", " ");
		String[] words = line.split(" ");
		for (int i =0;i<= words.length;i++){
			
		}
	}
	
}
