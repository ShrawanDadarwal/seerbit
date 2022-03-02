package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FundTransferRecipientPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3610770828904333347L;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("accountnumber")
	private String accountnumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "FundTransferRecipientPOJO [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber
				+ "]";
	}
	

}
