package hadoopFinal.model;

import java.net.MalformedURLException;
import java.net.URL;

public class Site {
	private double Size;
	private URL url;
	private double averageResponse;
	private double averageBytes;
	private double timeStamp;
	
	
	
	public Site(double size, String url, double averageResponse,
			double averageBytes, double timeStamp) throws MalformedURLException {
		super();
		Size = size;
		this.url = new URL(url);
		this.averageResponse = averageResponse;
		this.averageBytes = averageBytes;
		this.timeStamp = timeStamp;
	}
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
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Site)) return false;		
		return super.equals(((Site)obj).getUrl().getAuthority());
	}
	
}
