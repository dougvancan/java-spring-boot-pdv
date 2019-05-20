package com.pdv.api.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

	private String type;

	public Address() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
