package com.pdv.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdv.api.documents.Localizacao;
import com.pdv.api.documents.PontoDeVenda;
import com.pdv.api.responses.Response;
import com.pdv.api.services.PontoDeVendaService;

@RestController
@RequestMapping(path = "/api/pdvs")
public class PontoDeVendaController {
	
	@Autowired
	private PontoDeVendaService pontoDeVenda;
	
	@GetMapping
	public ResponseEntity<Response<List<PontoDeVenda>>> listAll() {
		return ResponseEntity.ok(new Response<List<PontoDeVenda>>(this.pontoDeVenda.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<PontoDeVenda>>> getPDVById(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Optional<PontoDeVenda>>(this.pontoDeVenda.getPDVById(id)));
	}
	
	@GetMapping(path="/searchPDV")
	public ResponseEntity<Response<Optional<PontoDeVenda>>> searchPDV(@Valid @RequestBody Localizacao localizacao, BindingResult result) {
		return ResponseEntity.ok(new Response<Optional<PontoDeVenda>>(this.pontoDeVenda.searchPDV(localizacao)));
	}
	
	@PostMapping
	public ResponseEntity<Response<PontoDeVenda>> createPDV(@Valid @RequestBody PontoDeVenda pdv, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<PontoDeVenda>(erros));
		}
		
		return ResponseEntity.ok(new Response<PontoDeVenda>(this.pontoDeVenda.createPDV(pdv)));
	}
	
}
