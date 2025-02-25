package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo")
public class Tipo {

//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipo", nullable = false)
	private Long idTipo;
	
	@Column(name = "nomeTipo", nullable = false, length = 100)
	private String nomeTipo;
	
//Construtores
	
	public Tipo() {
		
	}
	
	public Tipo(Long idTipo, String nomeTipo) {
		this.idTipo = idTipo;
		this.nomeTipo = nomeTipo;
	}

//Getters e Setters
	
	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	
}
