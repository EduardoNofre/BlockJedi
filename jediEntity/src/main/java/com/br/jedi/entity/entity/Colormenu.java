package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the colormenu database table.
 * 
 */
@Entity
@NamedQuery(name="Colormenu.findAll", query="SELECT c FROM Colormenu c")
public class Colormenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idcolorMenu;

	private String colorMenu;

	private String desccolorMenu;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="colormenu")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Colormenu() {
	}

	public Integer getIdcolorMenu() {
		return this.idcolorMenu;
	}

	public void setIdcolorMenu(Integer idcolorMenu) {
		this.idcolorMenu = idcolorMenu;
	}

	public String getColorMenu() {
		return this.colorMenu;
	}

	public void setColorMenu(String colorMenu) {
		this.colorMenu = colorMenu;
	}

	public String getDesccolorMenu() {
		return this.desccolorMenu;
	}

	public void setDesccolorMenu(String desccolorMenu) {
		this.desccolorMenu = desccolorMenu;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setColormenu(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setColormenu(null);

		return personalizacaocliente;
	}

}