package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Producto;
import pe.com.proygym.service.IProductoService;
import pe.com.proygym.service.impl.ProductoServiceImpl;


@ManagedBean
@SessionScoped
public class ProductoManagedBean {
	
	@ManagedProperty(value = "#{productoServiceImpl}")
	private ProductoServiceImpl productoServiceImpl;
	
	private Producto producto = new Producto();
	
	List<Producto> listProductos = new ArrayList<Producto>();

	
	
	
	//-------------------------------------------------------------

	
	
	
	public Producto getProducto() {
		return producto;
	}

	public ProductoServiceImpl getProductoServiceImpl() {
		return productoServiceImpl;
	}

	public void setProductoServiceImpl(ProductoServiceImpl productoServiceImpl) {
		this.productoServiceImpl = productoServiceImpl;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getListProductos() {
		return listProductos = productoServiceImpl.getAll();
	}

	public void setListProductos(List<Producto> listProductos) {
		this.listProductos = listProductos;
	}
	
}
