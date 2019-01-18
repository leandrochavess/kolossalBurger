package com.kolossalBurgerApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer numeroPedido;
	
	@Column(name="data_pedido")	
	private Date dataPedido;
	
	//@EmbeddedId
	//private PedidoPk chaveComposta;

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	/*public PedidoPk getChaveComposta() {
		return chaveComposta;
	}

	public void setChaveComposta(PedidoPk chaveComposta) {
		this.chaveComposta = chaveComposta;
	}*/

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
}
