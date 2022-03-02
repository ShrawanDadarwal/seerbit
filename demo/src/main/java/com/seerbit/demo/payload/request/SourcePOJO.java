package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SourcePOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5559626369232338486L;
	
	@JsonProperty("operation")
	private String operation;
	
	@JsonProperty("sender")
	private SenderPOJO sender;
	
	@JsonProperty("recipient")
	private RecipientPOJO recipient;

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

	public RecipientPOJO getRecipient() {
		return recipient;
	}

	public void setRecipient(RecipientPOJO recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "SourcePOJO [operation=" + operation + ", sender=" + sender + ", recipient=" + recipient + "]";
	}
	
	

}
