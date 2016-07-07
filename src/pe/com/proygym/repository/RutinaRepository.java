package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Rutina;
@Repository
public interface RutinaRepository extends CrudRepository<Rutina,String>{

}
