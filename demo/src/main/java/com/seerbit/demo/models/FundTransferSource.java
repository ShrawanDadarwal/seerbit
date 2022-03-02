package com.seerbit.demo.models;

public class FundTransferSource {
	private String operation;

	private Sender sender;

	private FundTransferRecipient recipient;

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

	public FundTransferRecipient getRecipient() {
		return recipient;
	}

	public void setRecipient(FundTransferRecipient recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "FundTransferSource [operation=" + operation + ", sender=" + sender + ", recipient=" + recipient + "]";
	}

}
