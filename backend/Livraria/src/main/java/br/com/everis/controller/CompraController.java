package br.com.everis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.dto.CompraDTO;
import br.com.everis.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private CompraService service;
	
	@PostMapping
	public ResponseEntity<?> realizaCompra(@RequestBody CompraDTO compraDTO){
		
		service.realizaCompra(compraDTO);
		
		return null;
	}
	
}
