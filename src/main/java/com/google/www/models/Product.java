package com.google.www.models;

public enum Product {
	
	PRODUCT("PlayStation Consola 4 Pro Stand Alone");
	
	private String date;

	Product(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return date;
	}

}
