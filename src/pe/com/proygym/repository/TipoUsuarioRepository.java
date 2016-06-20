package pe.com.proygym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Distrito;
import pe.com.proygym.model.TipoUsuario;
@Repository
public interface TipoUsuarioRepository  extends CrudRepository<TipoUsuario, Integer>{

}
