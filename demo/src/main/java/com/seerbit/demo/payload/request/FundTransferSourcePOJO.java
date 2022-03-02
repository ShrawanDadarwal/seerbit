package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundTransferSourcePOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 120116282950860303L;
	
	@JsonProperty("operation")
	private String operation;
	
	@JsonProperty("sender")
	private SenderPOJO sender;
	
	@JsonProperty("recipient")
	private FundTransferRecipientPOJO recipient;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public SenderPOJO getSender() {
		return sender;
	}

	public void setSender(SenderPOJO sender) {
		this.sender = sender;
	}

	public FundTransferRecipientPOJO getRecipient() {
		return recipient;
	}

	public void setRecipient(FundTransferRecipientPOJO recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "FundTransferSourcePOJO [operation=" + operation + ", sender=" + sender + ", recipient=" + recipient
				+ "]";
	}
	
	

}
