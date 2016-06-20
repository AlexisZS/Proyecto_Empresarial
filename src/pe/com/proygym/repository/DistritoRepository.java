package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Distrito;

@Repository
public interface DistritoRepository extends CrudRepository<Distrito, Integer> {

	
	
	
}
