package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idUsuario;

	private Byte ativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimologin;

	private String emailUsuario;

	private String empresaFilial;

	private Byte logado;

	private String loginUsuario;

	private String nomeUsuario;

	private String senhaUsuario;

	private String telefoneUsuario;

	//bi-directional many-to-one association to Perfil
	@OneToMany(mappedBy="usuario")
	private List<Perfil> perfils;

	//bi-directional many-to-one association to Perfilacesso
	@OneToMany(mappedBy="usuario")
	private List<Perfilacesso> perfilacessos;

	//bi-directional many-to-one association to Personalizacaocliente
	@OneToMany(mappedBy="usuario")
	private List<Personalizacaocliente> personalizacaoclientes;

	//bi-directional many-to-one association to Empresafilial
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEmpresaFilial")
	private Empresafilial empresafilial;

	public Usuario() {
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Byte  getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Byte  ativo) {
		this.ativo = ativo;
	}

	public Date getDataExclusao() {
		return this.dataExclusao;
	}

	public void setDataExclusao(Date dataExclusao) {
		this.dataExclusao = dataExclusao;
	}

	public Date getDataInclusao() {
		return this.dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataUltimologin() {
		return this.dataUltimologin;
	}

	public void setDataUltimologin(Date dataUltimologin) {
		this.dataUltimologin = dataUltimologin;
	}

	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getEmpresaFilial() {
		return this.empresaFilial;
	}

	public void setEmpresaFilial(String empresaFilial) {
		this.empresaFilial = empresaFilial;
	}

	public Byte getLogado() {
		return this.logado;
	}

	public void setLogado(Byte logado) {
		this.logado = logado;
	}

	public String getLoginUsuario() {
		return this.loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return this.senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getTelefoneUsuario() {
		return this.telefoneUsuario;
	}

	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}

	public Perfil addPerfil(Perfil perfil) {
		getPerfils().add(perfil);
		perfil.setUsuario(this);

		return perfil;
	}

	public Perfil removePerfil(Perfil perfil) {
		getPerfils().remove(perfil);
		perfil.setUsuario(null);

		return perfil;
	}

	public List<Perfilacesso> getPerfilacessos() {
		return this.perfilacessos;
	}

	public void setPerfilacessos(List<Perfilacesso> perfilacessos) {
		this.perfilacessos = perfilacessos;
	}

	public Perfilacesso addPerfilacesso(Perfilacesso perfilacesso) {
		getPerfilacessos().add(perfilacesso);
		perfilacesso.setUsuario(this);

		return perfilacesso;
	}

	public Perfilacesso removePerfilacesso(Perfilacesso perfilacesso) {
		getPerfilacessos().remove(perfilacesso);
		perfilacesso.setUsuario(null);

		return perfilacesso;
	}

	public List<Personalizacaocliente> getPersonalizacaoclientes() {
		return this.personalizacaoclientes;
	}

	public void setPersonalizacaoclientes(List<Personalizacaocliente> personalizacaoclientes) {
		this.personalizacaoclientes = personalizacaoclientes;
	}

	public Personalizacaocliente addPersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().add(personalizacaocliente);
		personalizacaocliente.setUsuario(this);

		return personalizacaocliente;
	}

	public Personalizacaocliente removePersonalizacaocliente(Personalizacaocliente personalizacaocliente) {
		getPersonalizacaoclientes().remove(personalizacaocliente);
		personalizacaocliente.setUsuario(null);

		return personalizacaocliente;
	}

	public Empresafilial getEmpresafilial() {
		return this.empresafilial;
	}

	public void setEmpresafilial(Empresafilial empresafilial) {
		this.empresafilial = empresafilial;
	}

}