package pe.com.proygym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Proveedor;
import pe.com.proygym.model.Usuario;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, String> {
	
	
	@Query("select d from Proveedor d where d.nombreCia = :v_nom")
	public List<Proveedor> obtenerSeriesPorId(@Param("v_nom")String nom);
}
