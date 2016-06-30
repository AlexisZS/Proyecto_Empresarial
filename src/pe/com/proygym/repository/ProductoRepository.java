package pe.com.proygym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, String> {
	
	Producto  findByIdProd(String idProd);

}
