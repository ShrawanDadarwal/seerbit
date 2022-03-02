package com.seerbit.demo.payload.response;

import java.io.Serializable;

public class Lock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5626551150857941193L;
	
	private String status;
	
	private String by;
	
	private String time;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Lock [status=" + status + ", by=" + by + ", time=" + time + "]";
	}
	
}
