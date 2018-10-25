package com.br.jedi.services.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.br.jedi.entity.entity.Usuario;
import com.br.jedi.services.dao.UsuarioDao;
import com.br.jedi.services.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Transactional(readOnly = true)
	public String login(Usuario usuario) {

		return "select * from  usuario where nome = ? and senha = ?";
	}
	
	public String Permissao(Usuario usuario) {

		return "select * from  usuario where nome = ? and senha = ?";
	}
}
