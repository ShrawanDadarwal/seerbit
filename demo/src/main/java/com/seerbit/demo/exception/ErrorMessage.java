package com.seerbit.demo.exception;

import java.util.Date;

public class ErrorMessage {
	private String statusCode;
	private Date timestamp;
	private String message;
	private String description;

	public ErrorMessage(String statusCode, Date timestamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Errorcode [statusCode=" + statusCode + ", timestamp=" + timestamp + ", message=" + message
				+ ", description=" + description + "]";
	}

	
}
