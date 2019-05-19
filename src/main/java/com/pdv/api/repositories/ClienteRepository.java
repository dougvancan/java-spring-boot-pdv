package com.pdv.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pdv.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
