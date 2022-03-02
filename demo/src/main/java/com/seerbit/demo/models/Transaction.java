package com.seerbit.demo.models;

public class Transaction {
	
	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Transaction [reference=" + reference + "]";
	}

}
