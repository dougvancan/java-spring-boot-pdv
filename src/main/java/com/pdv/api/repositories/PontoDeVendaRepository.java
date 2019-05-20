package com.pdv.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pdv.api.documents.PontoDeVenda;


public interface PontoDeVendaRepository extends MongoRepository<PontoDeVenda, String> {

}
