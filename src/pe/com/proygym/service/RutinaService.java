package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.RutinaRepository;


@Component
public class RutinaService {

	@Autowired
	private RutinaRepository rutinaRepository;

	public RutinaRepository getRutinaRepository() {
		return rutinaRepository;
	}

	public void setRutinaRepository(RutinaRepository rutinaRepository) {
		this.rutinaRepository = rutinaRepository;
	}
}
