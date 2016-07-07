package pe.com.proygym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,String>{
	
	

}
