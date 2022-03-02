package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashPickUpPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8041179121386056921L;
	private String id;
	
	@JsonProperty("publickey")
	private String publickey;

	@JsonProperty("transaction")
	private TransactionPOJO transaction;
	
	@JsonProperty("order")
	private PayoutCashPickUpOrderPOJO order;
	
	@JsonProperty("source")
	private SourcePOJO source;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublickey() {
		return publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public TransactionPOJO getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionPOJO transaction) {
		this.transaction = transaction;
	}

	public PayoutCashPickUpOrderPOJO getOrder() {
		return order;
	}

	public void setOrder(PayoutCashPickUpOrderPOJO order) {
		this.order = order;
	}

	public SourcePOJO getSource() {
		return source;
	}

	public void setSource(SourcePOJO source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "CashPickUpPOJO [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction + ", order="
				+ order + ", source=" + source + "]";
	}

	
}
