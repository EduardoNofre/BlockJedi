package com.br.jedi.services.dao;

import com.br.jedi.entity.entity.Usuario;

public interface UsuarioDao {

	public String login(Usuario usuario);

	String Permissao(Usuario usuario);
}
