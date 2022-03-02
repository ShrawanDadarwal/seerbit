package com.seerbit.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cash_pick_up")
public class CashPickUp {
	@Id
	private String id;

	private String publickey;

	private Transaction transaction;

	private CashPickUpOrder order;

	private Source source;

	
	

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

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public CashPickUpOrder getOrder() {
		return order;
	}

	public void setOrder(CashPickUpOrder order) {
		this.order = order;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "CashPickUp [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction + ", order=" + order
				+ ", source=" + source + "]";
	}
	
}
