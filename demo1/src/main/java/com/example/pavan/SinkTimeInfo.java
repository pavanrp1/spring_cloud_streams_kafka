/**
 * 
 */
package com.example.pavan;

/**
 * @author pk015603
 *
 */
public class SinkTimeInfo{
	 
	private String time;
	private String label;
	
	
	
	public SinkTimeInfo() {
		// TODO Auto-generated constructor stub
	}

	public SinkTimeInfo(String time, String label) {
		super();
		this.time = time;
		this.label = label;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setSinkLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return "SinkTimeInfo [time=" + time + ", label=" + label + "]";
	}

}
