package com.seerbit.demo.models;

public class Order {
	
	private String amount;
	
	private String description;
	
	private String reason;
	
	private String currency;
	
	private String country;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Order [amount=" + amount + ", description=" + description + ", reason=" + reason + ", currency="
				+ currency + ", country=" + country + "]";
	}
	
}
