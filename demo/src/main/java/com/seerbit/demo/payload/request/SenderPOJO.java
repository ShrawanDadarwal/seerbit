package com.seerbit.demo.payload.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SenderPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5769217452510413597L;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("mobile")
	private String mobile;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("idtype")
	private String idtype;
	
	@JsonProperty("idnumber")
	private String idnumber;
	
	@JsonProperty("idexpiry")
	private String idexpiry;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getIdexpiry() {
		return idexpiry;
	}

	public void setIdexpiry(String idexpiry) {
		this.idexpiry = idexpiry;
	}

	@Override
	public String toString() {
		return "SenderPOJO [name=" + name + ", address=" + address + ", mobile=" + mobile + ", country=" + country
				+ ", idtype=" + idtype + ", idnumber=" + idnumber + ", idexpiry=" + idexpiry + "]";
	}
	
	
}
