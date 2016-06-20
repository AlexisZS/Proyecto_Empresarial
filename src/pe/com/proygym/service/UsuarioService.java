package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.UsuarioRepository;

@Component
public class UsuarioService {

	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
}
