package com.pdv.api.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Localizacao {

	private Double lng;
	private Double lat;

	public Localizacao() {
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

}
