package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
