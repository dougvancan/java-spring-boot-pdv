package com.pdv.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CoverageArea {

	@Id
	private String type;

	public CoverageArea() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
