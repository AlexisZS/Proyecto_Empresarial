package pe.com.proygym.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.proygym.model.Producto;
import pe.com.proygym.repository.ProductoRepository;
import pe.com.proygym.service.IProductoService;

@Component
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto create(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto update(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void remove(String idProd) {
		remove(idProd);
	}

	@Override
	public List<Producto> getAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto getProducto(String idProd) {
		return productoRepository.findByIdProd(idProd);
	}

}
