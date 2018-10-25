package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the perfilacesso database table.
 * 
 */
@Entity
@NamedQuery(name="Perfilacesso.findAll", query="SELECT p FROM Perfilacesso p")
public class Perfilacesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPerfilAcesso;

	private Byte acesso;

	private Byte ativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInclusao;

	private String nomeAcesso;

	//bi-directional many-to-one association to Perfil
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPerfil")
	private Perfil perfil;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Perfilacesso() {
	}

	public Integer getIdPerfilAcesso() {
		return this.idPerfilAcesso;
	}

	public void setIdPerfilAcesso(Integer idPerfilAcesso) {
		this.idPerfilAcesso = idPerfilAcesso;
	}

	public Byte getAcesso() {
		return this.acesso;
	}

	public void setAcesso(Byte acesso) {
		this.acesso = acesso;
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

	public String getNomeAcesso() {
		return this.nomeAcesso;
	}

	public void setNomeAcesso(String nomeAcesso) {
		this.nomeAcesso = nomeAcesso;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}