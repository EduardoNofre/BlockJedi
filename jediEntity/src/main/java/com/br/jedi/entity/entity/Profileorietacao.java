package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profileorietacao database table.
 * 
 */
@Entity
@NamedQuery(name="Profileorietacao.findAll", query="SELECT p FROM Profileorietacao p")
public class Profileorietacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idprofileOrietacao;

	private String descprofileOrietacao;

	private String profileOrietacao;

	public Profileorietacao() {
	}

	public Integer getIdprofileOrietacao() {
		return this.idprofileOrietacao;
	}

	public void setIdprofileOrietacao(Integer idprofileOrietacao) {
		this.idprofileOrietacao = idprofileOrietacao;
	}

	public String getDescprofileOrietacao() {
		return this.descprofileOrietacao;
	}

	public void setDescprofileOrietacao(String descprofileOrietacao) {
		this.descprofileOrietacao = descprofileOrietacao;
	}

	public String getProfileOrietacao() {
		return this.profileOrietacao;
	}

	public void setProfileOrietacao(String profileOrietacao) {
		this.profileOrietacao = profileOrietacao;
	}

}