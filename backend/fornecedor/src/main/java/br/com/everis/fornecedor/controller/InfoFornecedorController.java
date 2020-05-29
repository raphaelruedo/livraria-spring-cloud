package br.com.everis.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.fornecedor.dto.InfoFornecedorDTO;
import br.com.everis.fornecedor.entity.InfoFornecedor;
import br.com.everis.fornecedor.repository.InfoFornecedorRepository;

@RestController
@RequestMapping("/info")
public class InfoFornecedorController {

    @Autowired
    private InfoFornecedorRepository _fornecedorRepository;

    @GetMapping("/{estado}")
    public InfoFornecedorDTO buscarFornecedorPorEstador(@PathVariable String estado)
    {
       InfoFornecedor inforFornecedor =  _fornecedorRepository.findByEstado(estado);

       return new InfoFornecedorDTO(inforFornecedor);
    }
    
}