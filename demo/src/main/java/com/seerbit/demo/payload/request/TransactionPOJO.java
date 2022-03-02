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
public class TransactionPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5018885104913732279L;
	
	@JsonProperty("reference")
	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "TransactionPOJO [reference=" + reference + "]";
	}
	
	
}
