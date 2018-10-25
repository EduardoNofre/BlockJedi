package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the compacto database table.
 * 
 */
@Entity
@NamedQuery(name="Compacto.findAll", query="SELECT c FROM Compacto c")
public class Compacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idcompacto;

	private String compacto;

	private String desccompacto;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="compacto")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Compacto() {
	}

	public Integer getIdcompacto() {
		return this.idcompacto;
	}

	public void setIdcompacto(Integer idcompacto) {
		this.idcompacto = idcompacto;
	}

	public String getCompacto() {
		return this.compacto;
	}

	public void setCompacto(String compacto) {
		this.compacto = compacto;
	}

	public String getDesccompacto() {
		return this.desccompacto;
	}

	public void setDesccompacto(String desccompacto) {
		this.desccompacto = desccompacto;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setCompacto(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setCompacto(null);

		return personalizacaocliente;
	}

}