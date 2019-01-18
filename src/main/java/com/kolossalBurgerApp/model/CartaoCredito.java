package com.kolossalBurgerApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartao_credito")
public class CartaoCredito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name = "numeroCartao")
	private Integer numero_cartao;
	@Column(name = "mes_validade")
	private Integer mesValidade;
	@Column(name = "ano_validade")
	private Integer anoValidade;
	@Column(name = "codigo_seg")
	private Integer codigoSeg;
	@Column(name = "nome_titular")
	private String nomeTitular;
	@Column(name = "cpf_titular")
	private Integer cpfTitular;
	
	@ManyToOne
	private Cliente cliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero_cartao() {
		return numero_cartao;
	}
	public void setNumero_cartao(Integer numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	public Integer getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}
	public Integer getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}
	public Integer getCodigoSeg() {
		return codigoSeg;
	}
	public void setCodigoSeg(Integer codigoSeg) {
		this.codigoSeg = codigoSeg;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Integer getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(Integer cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
	

}
