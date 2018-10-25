/**
 * 
 */
package com.br.jedi.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jedi.entity.entity.Usuario;
import com.br.jedi.services.dao.UsuarioDao;
import com.br.jedi.services.services.UsuarioServices;

/**
 * @author Eduardo
 *
 */
@Service
public class UsuarioServicesImpl implements UsuarioServices {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public void login(Usuario usuario) {
		
		usuarioDao.login(usuario);
	}
}
