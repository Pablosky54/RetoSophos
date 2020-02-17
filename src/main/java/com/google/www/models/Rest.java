package com.google.www.models;

public enum Rest {
	
	BASE("https://gorest.co.in"),
	CONSULT("/public-api/users?first_name=* and last_name=*"),
	AUTHORIZATION("?access-token=bkNPHCvcaefhH7b_cVW5QVc2JEMeyljQ2XeW");
	

	private String uri;

	Rest(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return uri;
	}


}
