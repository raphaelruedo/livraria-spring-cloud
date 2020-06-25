package br.com.everis.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.everis.dto.InfoFornecedorDTO;
import br.com.everis.dto.InfoPedidoDTO;
import br.com.everis.dto.ItemDTO;

@FeignClient(name = "fornecedor")
public interface FornecedorClient {

    @GetMapping("/info/{estado}")
    public InfoFornecedorDTO buscarFornecedorPorEstador(@PathVariable String estado);

    @GetMapping("/pedido")
    public InfoPedidoDTO realizaPedido(List<ItemDTO> pedidos);
    
}