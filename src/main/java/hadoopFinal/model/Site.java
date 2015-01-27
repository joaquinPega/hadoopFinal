package hadoopFinal.model;

import java.net.URL;

public class Site {
	private double Size;
	private URL url;
	private double averageResponse;
	private double averageBytes;
	private double timeStamp;
	
	
	
	public double getSize() {
		return Size;
	}
	public void setSize(double size) {
		Size = size;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public double getAverageResponse() {
		return averageResponse;
	}
	public void setAverageResponse(double averageResponse) {
		this.averageResponse = averageResponse;
	}
	public double getAverageBytes() {
		return averageBytes;
	}
	public void setAverageBytes(double averageBytes) {
		this.averageBytes = averageBytes;
	}
	public double getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(double timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
