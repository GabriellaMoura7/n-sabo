package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente", nullable = false)
	private Long idProduto;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "preco", nullable = false, length = 50)
	private Double preco;
	
	@Column(name = "cor", nullable = false, length = 50)
	private String cor;
	
//Construtores
	
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String nome, Double preco, String cor) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
	}

//Getters e Setters
	
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
