package br.com.everis.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.everis.fornecedor.entity.InfoFornecedor;

public interface InfoFornecedorRepository extends JpaRepository<InfoFornecedor, Long> {
    
    InfoFornecedor findByEstado(String estado);
}