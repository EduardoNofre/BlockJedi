package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tema database table.
 * 
 */
@Entity
@NamedQuery(name="Tema.findAll", query="SELECT t FROM Tema t")
public class Tema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idtema;

	private String desctema;

	private String tema;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="tema")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Tema() {
	}

	public Integer getIdtema() {
		return this.idtema;
	}

	public void setIdtema(Integer idtema) {
		this.idtema = idtema;
	}

	public String getDesctema() {
		return this.desctema;
	}

	public void setDesctema(String desctema) {
		this.desctema = desctema;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setTema(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setTema(null);

		return personalizacaocliente;
	}

}