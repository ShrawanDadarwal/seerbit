package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundTransferToWalletPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	
	@JsonProperty("publickey")
	private String publickey;

	@JsonProperty("transaction")
	private TransactionPOJO transaction;

	@JsonProperty("order")
	private OrderPOJO order;

	@JsonProperty("source")
	private FundTransferSourcePOJO source;

	
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

	public OrderPOJO getOrder() {
		return order;
	}

	public void setOrder(OrderPOJO order) {
		this.order = order;
	}

	public FundTransferSourcePOJO getSource() {
		return source;
	}

	public void setSource(FundTransferSourcePOJO source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "FundTransferToWalletPOJO [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction
				+ ", order=" + order + ", source=" + source + "]";
	}

}
