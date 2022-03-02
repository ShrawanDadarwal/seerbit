package com.seerbit.demo.payload.response;

public class JwtResponse {
	private String access_token;
	private String expires_in ;

	public JwtResponse(String accessToken, String expires_in) {
		this.access_token = accessToken;
		this.expires_in = expires_in;
		
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	
}
