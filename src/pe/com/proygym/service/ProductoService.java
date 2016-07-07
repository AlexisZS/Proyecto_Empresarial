package pe.com.proygym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.model.Producto;
import pe.com.proygym.repository.ProductoRepository;

@Component
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	

	public Producto create(Producto producto) {
		return productoRepository.save(producto);
	}

	public Producto update(Producto producto) {
		return productoRepository.save(producto);
	}

	public void remove(String idProd) {
		remove(idProd);
	}

	
	public List<Producto> getAll() {
		return productoRepository.findAll();
	}

	
	public Producto getProducto(String idProd) {
		return productoRepository.findByIdProd(idProd);
	}

}
