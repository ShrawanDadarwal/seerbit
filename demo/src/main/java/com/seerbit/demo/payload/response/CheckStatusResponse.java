package com.seerbit.demo.payload.response;

import java.io.Serializable;

import com.seerbit.demo.payload.request.OrderPOJO;
import com.seerbit.demo.payload.request.SourcePOJO;

public class CheckStatusResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8646212862697098709L;
	private String id;

	private String code;

	private String message;

	private ReferenceTransactionPOJO transaction;
	
	private Lock lock;
	
	private OrderPOJO order;
	
	private SourcePOJO source;
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


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


	public Lock getLock() {
		return lock;
	}


	public void setLock(Lock lock) {
		this.lock = lock;
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
		return "CheckStatusResponse [id=" + id + ", code=" + code + ", message=" + message + ", transaction="
				+ transaction + ", lock=" + lock + ", order=" + order + ", source=" + source + "]";
	}
	
}
