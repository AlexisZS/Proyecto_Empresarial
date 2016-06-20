package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.TipoUsuarioRepository;


@Component
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository ;

	public TipoUsuarioRepository getTipoUsuarioRepository() {
		return tipoUsuarioRepository;
	}

	public void setTipoUsuarioRepository(TipoUsuarioRepository tipoUsuarioRepository) {
		this.tipoUsuarioRepository = tipoUsuarioRepository;
	}
	
	
	
}
