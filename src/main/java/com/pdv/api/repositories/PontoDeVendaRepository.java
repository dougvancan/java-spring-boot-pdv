package com.pdv.api.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pdv.api.documents.PontoDeVenda;

public interface PontoDeVendaRepository extends MongoRepository<PontoDeVenda, String> {
	
	//@Query("{\"_id\": ?0 }")
	Optional<PontoDeVenda> searchPDV(String lat, String lng);

}
