package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPerfil;

	private Byte ativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInclusao;

	private String nomePerfil;

	private String usuarioAlteracao;

	private String usuarioInclusao;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Perfilacesso
	@OneToMany(mappedBy="perfil")
	private List<Perfilacesso> perfilacessos;

	public Perfil() {
	}

	public Integer getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Byte getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Byte ativo) {
		this.ativo = ativo;
	}

	public Date getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
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

	public String getNomePerfil() {
		return this.nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

	public String getUsuarioAlteracao() {
		return this.usuarioAlteracao;
	}

	public void setUsuarioAlteracao(String usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}

	public String getUsuarioInclusao() {
		return this.usuarioInclusao;
	}

	public void setUsuarioInclusao(String usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Perfilacesso> getPerfilacessos() {
		return this.perfilacessos;
	}

	public void setPerfilacessos(List<Perfilacesso> perfilacessos) {
		this.perfilacessos = perfilacessos;
	}

	public Perfilacesso addPerfilacesso(Perfilacesso perfilacesso) {
		getPerfilacessos().add(perfilacesso);
		perfilacesso.setPerfil(this);

		return perfilacesso;
	}

	public Perfilacesso removePerfilacesso(Perfilacesso perfilacesso) {
		getPerfilacessos().remove(perfilacesso);
		perfilacesso.setPerfil(null);

		return perfilacesso;
	}

}