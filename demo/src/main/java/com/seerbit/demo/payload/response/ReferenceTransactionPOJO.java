package com.seerbit.demo.payload.response;

import java.io.Serializable;

import lombok.Data;

public class ReferenceTransactionPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 166953410901876024L;
	
	private String reference;

	private String linkingreference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getLinkingreference() {
		return linkingreference;
	}

	public void setLinkingreference(String linkingreference) {
		this.linkingreference = linkingreference;
	}

	@Override
	public String toString() {
		return "ReferenceTransactionPOJO [reference=" + reference + ", linkingreference=" + linkingreference + "]";
	}
	
}
