package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.ClientRepository;

@Component
public class ClienteServices {

	@Autowired
	private ClientRepository clientRepository;

	public ClientRepository getClientRepository() {
		return clientRepository;
	}

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	
}
