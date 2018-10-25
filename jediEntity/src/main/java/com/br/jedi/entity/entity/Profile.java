package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idprofile;

	private String descprofile;

	private String profile;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="profile")
	private List<Personalizacaocliente> personalizacaoclientes;

	public Profile() {
	}

	public Integer getIdprofile() {
		return this.idprofile;
	}

	public void setIdprofile(Integer idprofile) {
		this.idprofile = idprofile;
	}

	public String getDescprofile() {
		return this.descprofile;
	}

	public void setDescprofile(String descprofile) {
		this.descprofile = descprofile;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setProfile(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setProfile(null);

		return personalizacaocliente;
	}

}