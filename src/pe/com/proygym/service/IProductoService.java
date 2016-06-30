package pe.com.proygym.service;

import java.util.List;
import pe.com.proygym.model.Producto;

public interface IProductoService {

	
	Producto create(Producto producto);
	Producto update (Producto  producto);
	void remove(String idProd);
	List<Producto> getAll();
	Producto getProducto(String idProd);
	
}
