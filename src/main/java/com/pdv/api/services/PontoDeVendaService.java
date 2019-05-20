package com.pdv.api.services;

import java.util.List;
import java.util.Optional;

import com.pdv.api.documents.Localizacao;
import com.pdv.api.documents.PontoDeVenda;

public interface PontoDeVendaService {
	
	List<PontoDeVenda> listAll();
	
	Optional<PontoDeVenda> getPDVById(String id);
	
	Optional<PontoDeVenda> searchPDV(Localizacao localizacao);
	
	PontoDeVenda createPDV(PontoDeVenda  pontoDeVenda);
	
}
