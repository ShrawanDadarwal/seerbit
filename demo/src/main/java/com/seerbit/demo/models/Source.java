package com.seerbit.demo.models;

public class Source {
	
	private String operation;
	
	private Sender sender;
	
	private Recipient recipient;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "Source [operation=" + operation + ", sender=" + sender + ", recipient=" + recipient + "]";
	}

	
}
