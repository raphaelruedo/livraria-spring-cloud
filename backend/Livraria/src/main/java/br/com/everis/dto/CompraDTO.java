package br.com.everis.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemDTO> items;
	private EnderecoDTO endereco;
	
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	
	
}
