package com.br.jedi.entity.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the empresafilial database table.
 * 
 */
@Entity
@NamedQuery(name="Empresafilial.findAll", query="SELECT e FROM Empresafilial e")
public class Empresafilial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idEmpresaFilial;

	private Byte ativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInclusao;

	private String nomeEmpresaFilial;

	private String usuarioAlteracao;

	private String usuarioInclusao;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="empresafilial")
	private List<Usuario> usuarios;

	public Empresafilial() {
	}

	public Integer getIdEmpresaFilial() {
		return this.idEmpresaFilial;
	}

	public void setIdEmpresaFilial(Integer idEmpresaFilial) {
		this.idEmpresaFilial = idEmpresaFilial;
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

	public String getNomeEmpresaFilial() {
		return this.nomeEmpresaFilial;
	}

	public void setNomeEmpresaFilial(String nomeEmpresaFilial) {
		this.nomeEmpresaFilial = nomeEmpresaFilial;
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

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setEmpresafilial(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setEmpresafilial(null);

		return usuario;
	}

}