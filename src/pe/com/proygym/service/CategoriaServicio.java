package pe.com.proygym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.model.Categoria;
import pe.com.proygym.repository.CategoriaRepository;

@Component
public class CategoriaServicio {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getOne(String id){
		return categoriaRepository.findOne(id);
	}
	
}
