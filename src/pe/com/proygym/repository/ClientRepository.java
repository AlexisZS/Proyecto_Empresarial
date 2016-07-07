package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Cliente;

@Repository
public interface ClientRepository extends CrudRepository<Cliente, String>{

}
