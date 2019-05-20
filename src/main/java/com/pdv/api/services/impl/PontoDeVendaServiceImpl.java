package com.pdv.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdv.api.documents.Localizacao;
import com.pdv.api.documents.PontoDeVenda;
import com.pdv.api.repositories.PontoDeVendaRepository;
import com.pdv.api.services.PontoDeVendaService;

@Service
public class PontoDeVendaServiceImpl implements PontoDeVendaService {
	
	@Autowired
	private PontoDeVendaRepository pontoDeVendaRespository;

	@Override
	public List<PontoDeVenda> listAll() {
		return this.pontoDeVendaRespository.findAll();
	}

	@Override
	public Optional<PontoDeVenda> getPDVById(String id) {
		return this.pontoDeVendaRespository.findById(id);
	}
	
	@Override
	public Optional<PontoDeVenda> searchPDV(Localizacao lozalizacao) {
		return this.pontoDeVendaRespository.findById(String.valueOf(lozalizacao.getLat()));
	}
	
	@Override
	public PontoDeVenda createPDV(PontoDeVenda pontoDeVenda) {
		return this.pontoDeVendaRespository.save(pontoDeVenda);
	}


}
