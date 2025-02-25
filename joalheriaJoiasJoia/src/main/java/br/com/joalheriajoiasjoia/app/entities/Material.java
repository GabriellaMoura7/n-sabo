package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

;

@Entity
@Table(name = "tb_material")
public class Material {

//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMaterial", nullable = false)
	private Long idMaterial;
	
	@Column(name = "nomeMaterial", nullable = false, length = 100)
	private String nomeMaterial;
	
	@Column(name = "tipo", nullable = false, length = 50)
	private String tipo;
	
//Construtores
	public Material() {
		
	}
	
	public Material(Long idMaterial, String nomeMaterial, String tipo) {
		this.idMaterial = idMaterial;
		this.nomeMaterial = nomeMaterial;
		this.tipo = tipo;
	}

//Getters e Setters
	
	public Long getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(Long idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getNomeMaterial() {
		return nomeMaterial;
	}

	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
