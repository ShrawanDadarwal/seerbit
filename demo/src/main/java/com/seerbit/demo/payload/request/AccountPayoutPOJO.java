package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class AccountPayoutPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2928418883093046589L;
	private String id;

	@JsonProperty("publickey")
	private String publickey;

	@JsonProperty("transaction")
	private TransactionPOJO transaction;

	@JsonProperty("order")
	private OrderPOJO order;

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

	public OrderPOJO getOrder() {
		return order;
	}

	public void setOrder(OrderPOJO order) {
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
		return "AccountPayoutPOJO [id=" + id + ", publickey=" + publickey + ", transaction=" + transaction + ", order="
				+ order + ", source=" + source + "]";
	}


}
