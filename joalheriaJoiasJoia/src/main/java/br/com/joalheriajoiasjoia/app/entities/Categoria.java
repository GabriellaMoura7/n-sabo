package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoria", nullable = false)
	private Long idCategoria;
	
	@Column(name = "nomeCategoria", nullable = false, length = 100)
	private String nomeCategoria;
	
//Construtores
	
	public Categoria() {
		
	}
	
	public Categoria(Long idCategoria, String nomeCategoria) {
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}

//Getters e Setters
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
}
