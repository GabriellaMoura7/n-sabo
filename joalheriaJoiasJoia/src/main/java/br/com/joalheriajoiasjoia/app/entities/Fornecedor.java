package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFornecedor", nullable = false)
	private Long idFornecedor;
	
	@Column(name = "nomeFornecedor", nullable = false, length = 100)
	private String nomeFornecedor;
	
	@Column(name = "telefone", nullable = false, length = 11, unique = true)
	private String telefone;
	
	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(name = "endComp", nullable = false,  unique = false)
	private String endComp;
	
	@Column(name = "nomeCont", nullable = true, unique = false)
	private String nomeCont;
	
//Construtores
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(Long idFornecedor, String telefone, String nomeFornecedor, String email, String endComp, String nomeCont) {
		this.idFornecedor = idFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.telefone = telefone;
		this.email = email;
		this.endComp = endComp;
		this.nomeCont = nomeCont;
		
	}

//Getters e Setters
	
	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndComp() {
		return endComp;
	}

	public void setEndComp(String endComp) {
		this.endComp = endComp;
	}

	public String getNomeCont() {
		return nomeCont;
	}

	public void setNomeCont(String nomeCont) {
		this.nomeCont = nomeCont;
	}

}
