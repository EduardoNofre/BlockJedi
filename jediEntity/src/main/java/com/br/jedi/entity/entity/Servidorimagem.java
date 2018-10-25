package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the servidorimagem database table.
 * 
 */
@Entity
@NamedQuery(name="Servidorimagem.findAll", query="SELECT s FROM Servidorimagem s")
public class Servidorimagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idServicor;

	private String descServidor;

	private String ipServidor;

	private String nomeServidor;

	private String tipoServidor;

	public Servidorimagem() {
	}

	public Integer getIdServicor() {
		return this.idServicor;
	}

	public void setIdServicor(Integer idServicor) {
		this.idServicor = idServicor;
	}

	public String getDescServidor() {
		return this.descServidor;
	}

	public void setDescServidor(String descServidor) {
		this.descServidor = descServidor;
	}

	public String getIpServidor() {
		return this.ipServidor;
	}

	public void setIpServidor(String ipServidor) {
		this.ipServidor = ipServidor;
	}

	public String getNomeServidor() {
		return this.nomeServidor;
	}

	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}

	public String getTipoServidor() {
		return this.tipoServidor;
	}

	public void setTipoServidor(String tipoServidor) {
		this.tipoServidor = tipoServidor;
	}

}