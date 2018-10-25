package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the colorlayout database table.
 * 
 */
@Entity
@NamedQuery(name="Colorlayout.findAll", query="SELECT c FROM Colorlayout c")
public class Colorlayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idcolorLayout;

	private String colorLayout;

	private String desctema;

	private String valuecolorLayout;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="colorlayout")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Colorlayout() {
	}

	public Integer getIdcolorLayout() {
		return this.idcolorLayout;
	}

	public void setIdcolorLayout(Integer idcolorLayout) {
		this.idcolorLayout = idcolorLayout;
	}

	public String getColorLayout() {
		return this.colorLayout;
	}

	public void setColorLayout(String colorLayout) {
		this.colorLayout = colorLayout;
	}

	public String getDesctema() {
		return this.desctema;
	}

	public void setDesctema(String desctema) {
		this.desctema = desctema;
	}

	public String getValuecolorLayout() {
		return this.valuecolorLayout;
	}

	public void setValuecolorLayout(String valuecolorLayout) {
		this.valuecolorLayout = valuecolorLayout;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setColorlayout(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setColorlayout(null);

		return personalizacaocliente;
	}

}