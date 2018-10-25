package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the menulayout database table.
 * 
 */
@Entity
@NamedQuery(name="Menulayout.findAll", query="SELECT m FROM Menulayout m")
public class Menulayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idmenuLayout;

	private String descmenuLayout;

	private String menuLayout;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="menulayout")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Menulayout() {
	}

	public Integer getIdmenuLayout() {
		return this.idmenuLayout;
	}

	public void setIdmenuLayout(Integer idmenuLayout) {
		this.idmenuLayout = idmenuLayout;
	}

	public String getDescmenuLayout() {
		return this.descmenuLayout;
	}

	public void setDescmenuLayout(String descmenuLayout) {
		this.descmenuLayout = descmenuLayout;
	}

	public String getMenuLayout() {
		return this.menuLayout;
	}

	public void setMenuLayout(String menuLayout) {
		this.menuLayout = menuLayout;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setMenulayout(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setMenulayout(null);

		return personalizacaocliente;
	}

}