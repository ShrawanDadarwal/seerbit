package com.seerbit.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "func_Transfer_to_wallet")
public class FundTransferToWallet {
	@Id
	private String id;
	
	private String publickey;

	private Transaction transaction;

	private Order order;

	private FundTransferSource source;


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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public FundTransferSource getSource() {
		return source;
	}

	public void setSource(FundTransferSource source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "FundTransferToWallet [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction
				+ ", order=" + order + ", source=" + source + "]";
	}

}
