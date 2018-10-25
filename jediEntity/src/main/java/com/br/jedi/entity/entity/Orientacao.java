package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the orientacao database table.
 * 
 */
@Entity
@NamedQuery(name="Orientacao.findAll", query="SELECT o FROM Orientacao o")
public class Orientacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idorientacao;

	private String descorientacao;

	private String orientacao;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="orientacao")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Orientacao() {
	}

	public Integer getIdorientacao() {
		return this.idorientacao;
	}

	public void setIdorientacao(Integer idorientacao) {
		this.idorientacao = idorientacao;
	}

	public String getDescorientacao() {
		return this.descorientacao;
	}

	public void setDescorientacao(String descorientacao) {
		this.descorientacao = descorientacao;
	}

	public String getOrientacao() {
		return this.orientacao;
	}

	public void setOrientacao(String orientacao) {
		this.orientacao = orientacao;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setOrientacao(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setOrientacao(null);

		return personalizacaocliente;
	}

}