package br.com.everis.fornecedor.dto;

import br.com.everis.fornecedor.entity.InfoFornecedor;

public class InfoFornecedorDTO {

    private String endereco;

    public InfoFornecedorDTO(InfoFornecedor infoFornecedor) {
        endereco = infoFornecedor.getEndereco();
    }

    public String getEndereco() {
        return this.endereco;
    }

}