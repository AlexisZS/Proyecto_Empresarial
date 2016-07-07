package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.ProveedorRepository;


@Component
public class ProveedorServicio {

	@Autowired
	private ProveedorRepository proveedorRepository;

	public ProveedorRepository getProveedorRepository() {
		return proveedorRepository;
	}

	public void setProveedorRepository(ProveedorRepository proveedorRepository) {
		this.proveedorRepository = proveedorRepository;
	}
	
	
}
