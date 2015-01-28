package hadoopFinal.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class Site implements WritableComparable<Site>{
	private LongWritable size;
	private Text url;
	private LongWritable averageResponse;
	private LongWritable averageBytes;
	private DoubleWritable timeStamp;
	
	


	public Site(long size, String url, long averageResponse,
			long averageBytes, double timeStamp) {
		super();
		this.size = new LongWritable(size);
		this.url = new Text(url);
		this.averageResponse =  new LongWritable(averageResponse);
		this.averageBytes =  new LongWritable(averageBytes);
		this.timeStamp =  new DoubleWritable(timeStamp);
	}
	public LongWritable getSize() {
		return size;
	}
	public void setSize(LongWritable size) {
		this.size = size;
	}
	public Text getUrl() {
		return url;
	}
	public void setUrl(Text url) {
		this.url = url;
	}
	public LongWritable getAverageResponse() {
		return averageResponse;
	}
	public void setAverageResponse(LongWritable averageResponse) {
		this.averageResponse = averageResponse;
	}
	public LongWritable getAverageBytes() {
		return averageBytes;
	}
	public void setAverageBytes(LongWritable averageBytes) {
		this.averageBytes = averageBytes;
	}
	public DoubleWritable getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(DoubleWritable timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void readFields(DataInput in) throws IOException {
		size.readFields(in);
		url.readFields(in);
		averageResponse.readFields(in);
		averageBytes.readFields(in);
		timeStamp.readFields(in);
	}
	public void write(DataOutput out) throws IOException {
		size.write(out);
		url.write(out);
		averageResponse.write(out);
		averageBytes.write(out);
		timeStamp.write(out);
		
	}
	public int compareTo(Site o) {
		return url.compareTo(o.getUrl());
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(!(obj instanceof Site))return false;		
		return url.equals(((Site)obj).getUrl());
	}
	
}
