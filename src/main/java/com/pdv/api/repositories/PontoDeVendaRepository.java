package com.pdv.api.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pdv.api.documents.PontoDeVenda;

public interface PontoDeVendaRepository extends MongoRepository<PontoDeVenda, String> {

//Exemplo	
//var neighborhood = db.neighborhoods.findOne( { geometry: { $geoIntersects: { $geometry: { type: "Point", coordinates: [ -73.93414657, 40.82302903 ] } } } } )
//db.restaurants.find( { location: { $geoWithin: { $geometry: neighborhood.geometry } } } ).count()	
	//@Query("{\"_id\": ?0 }")
	@Query("{\"_id\": ?0 }")
	Optional<PontoDeVenda> searchPDV(double lat, double lng);

}
