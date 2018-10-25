package com.br.jedi.login.view;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.br.jedi.entity.entity.Usuario;
import com.br.jedi.services.services.UsuarioServices;

@Controller
@ManagedBean
@ViewScoped
public class LoginView {

	@Autowired
	private UsuarioServices usuarioServices;

	public Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void login() {

		usuarioServices.login(usuario);
	}
}