package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Actividad;



@Repository
public interface ActividadRepository  extends CrudRepository<Actividad, String>{

}