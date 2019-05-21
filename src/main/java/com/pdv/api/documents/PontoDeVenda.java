package com.pdv.api.documents;

import javax.validation.constraints.NotEmpty;

import org.geojson.GeoJsonObject;
import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * {
        "id": 1, 
        "tradingName": "Adega da Cerveja - Pinheiros",
        "ownerName": "Zé da Silva",
        "document": "1432132123891/0001", //CNPJ
        "coverageArea": { 
          "type": "MultiPolygon", 
          "coordinates": [
            [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
            [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
          ]
        }, //Área de Cobertura
        "address": { 
          "type": "Point",
          "coordinates": [-46.57421, -21.785741]
        }, // Localização do PDV
    }
 */

@Document
public class PontoDeVenda {

	@NotEmpty(message="id não pode ser vazio")
	private String id;
	@NotEmpty(message="tradingName não pode ser vazio")
	private String tradingName;
	@NotEmpty(message="ownerName não pode ser vazio")
	private String ownerName;
	@NotEmpty(message="CNPJ não pode ser vazio")
	@CNPJ(message="CNPJ inválido")
	private String document;
    private GeoJsonObject coverageArea;
	private GeoJsonObject address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTradingName() {
		return tradingName;
	}
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public GeoJsonObject getCoverageArea() {
		return coverageArea;
	}
	public void setCoverageArea(GeoJsonObject coverageArea) {
		this.coverageArea = coverageArea;
	}
	public GeoJsonObject getAddress() {
		return address;
	}
	public void setAddress(GeoJsonObject address) {
		this.address = address;
	}
	
	

}
