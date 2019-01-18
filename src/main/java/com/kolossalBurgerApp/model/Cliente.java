package com.kolossalBurgerApp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="nome_cliente")
	private String nomeCliente;
	@Column(name="cpf_cliente")
	private Integer cpfCliente;
	private Integer telefone;
	@Column(name="data_nascimento")
	private Date dataNascimento;
	@Column(name="email_cliente")
	private String emailCliente;

	@OneToMany
	private List<Endereco> enderecos;

	@OneToMany
	private List<CartaoCredito> cartoes;

	public List<CartaoCredito> getCartoes() {
		return cartoes;
	}
	public void setCartoes(List<CartaoCredito> cartoes) {
		this.cartoes = cartoes;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Integer getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(Integer cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}



}
