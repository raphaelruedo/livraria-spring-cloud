package br.com.everis.service;

import org.springframework.stereotype.Service;
import br.com.everis.client.FornecedorClient;
import br.com.everis.dto.CompraDTO;
import br.com.everis.dto.InfoFornecedorDTO;
import br.com.everis.dto.InfoPedidoDTO;

@Service
public class CompraService {

	private final FornecedorClient _fornecedorClient;

	public CompraService(FornecedorClient fornecedorClient) {
		this._fornecedorClient = fornecedorClient;
	}

	public void realizaCompra(CompraDTO compraDTO) {

		InfoFornecedorDTO infoFornecedoDTO = _fornecedorClient.buscarFornecedorPorEstador(compraDTO.getEndereco().getEstado());

		InfoPedidoDTO infoPedidoDTO = _fornecedorClient.realizaPedido(compraDTO.getItems());

		System.out.println(infoFornecedoDTO.getEndereco());
	}

}
