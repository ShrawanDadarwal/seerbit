package com.seerbit.demo.models;

public class FundTransferRecipient {
	private String name;

	private String address;

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
		return "FundTransferRecipient [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber
				+ "]";
	}
	
}
