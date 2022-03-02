package com.seerbit.demo.payload.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class PayoutResponsePOJO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String message;
	
	private ReferenceTransactionPOJO transaction;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ReferenceTransactionPOJO getTransaction() {
		return transaction;
	}

	public void setTransaction(ReferenceTransactionPOJO transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "PayoutResponsePOJO [code=" + code + ", message=" + message + ", transaction=" + transaction + "]";
	}
	
	
}
