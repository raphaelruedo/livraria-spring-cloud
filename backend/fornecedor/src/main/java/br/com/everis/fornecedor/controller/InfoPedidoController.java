package br.com.everis.fornecedor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.fornecedor.dto.InfoPedidoDTO;
import br.com.everis.fornecedor.dto.ItemDTO;

@RestController
@RequestMapping("/pedidos")
public class InfoPedidoController {
    
    @PostMapping
    public InfoPedidoDTO realizaPedido(List<ItemDTO> pedidos){

        return new InfoPedidoDTO();
    }


}