package pe.com.proygym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.repository.ActividadRepository;


@Component
public class ActividadServicio {

	@Autowired
	private ActividadRepository actividadRepository;

	public ActividadRepository getActividadRepository() {
		return actividadRepository;
	}

	public void setActividadRepository(ActividadRepository actividadRepository) {
		this.actividadRepository = actividadRepository;
	}
	
}
