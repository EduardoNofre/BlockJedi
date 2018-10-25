package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personalizacaocliente database table.
 * 
 */
@Entity
@NamedQuery(name="Personalizacaocliente.findAll", query="SELECT p FROM Personalizacaocliente p")
public class Personalizacaocliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idpersonalizacaoCliente;

	//bi-directional many-to-one association to Colorlayout
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcolorLayout")
	private Colorlayout colorlayout;

	//bi-directional many-to-one association to Colormenu
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcolorMenu")
	private Colormenu colormenu;

	//bi-directional many-to-one association to Compacto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcompacto")
	private Compacto compacto;

	//bi-directional many-to-one association to Menulayout
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idmenuLayout")
	private Menulayout menulayout;

	//bi-directional many-to-one association to Orientacao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idorientacao")
	private Orientacao orientacao;

	//bi-directional many-to-one association to Profile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idprofile")
	private Profile profile;

	//bi-directional many-to-one association to Tema
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtema")
	private Tema tema;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public Personalizacaocliente() {
	}

	public Integer getIdpersonalizacaoCliente() {
		return this.idpersonalizacaoCliente;
	}

	public void setIdpersonalizacaoCliente(Integer idpersonalizacaoCliente) {
		this.idpersonalizacaoCliente = idpersonalizacaoCliente;
	}

	public Colorlayout getColorlayout() {
		return this.colorlayout;
	}

	public void setColorlayout(Colorlayout colorlayout) {
		this.colorlayout = colorlayout;
	}

	public Colormenu getColormenu() {
		return this.colormenu;
	}

	public void setColormenu(Colormenu colormenu) {
		this.colormenu = colormenu;
	}

	public Compacto getCompacto() {
		return this.compacto;
	}

	public void setCompacto(Compacto compacto) {
		this.compacto = compacto;
	}

	public Menulayout getMenulayout() {
		return this.menulayout;
	}

	public void setMenulayout(Menulayout menulayout) {
		this.menulayout = menulayout;
	}

	public Orientacao getOrientacao() {
		return this.orientacao;
	}

	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Tema getTema() {
		return this.tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}