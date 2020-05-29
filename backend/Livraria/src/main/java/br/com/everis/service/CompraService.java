package br.com.everis.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.everis.dto.CompraDTO;
import br.com.everis.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	private final String endpointFornecedor = "http://fornecedor/info/%s";
	private final RestTemplate _client;

	public CompraService(RestTemplate client){
		this._client = client;
	}

	public void realizaCompra(CompraDTO compraDTO) {
		
		ResponseEntity<InfoFornecedorDTO> infoFornecedor = _client.exchange(String.format(endpointFornecedor, compraDTO.getEndereco().getEstado()),
		 HttpMethod.GET, null, InfoFornecedorDTO.class);

		 System.out.println(infoFornecedor.getBody().getEndereco());
	}
	
}
