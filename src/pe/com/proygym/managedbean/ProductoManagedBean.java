package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Producto;
import pe.com.proygym.service.IProductoService;


@ManagedBean
@SessionScoped
public class ProductoManagedBean {
	
	@ManagedProperty(value = "#{iProductoService}")
	private IProductoService iProductoService;
	
	private Producto producto = new Producto();
	
	List<Producto> listProductos = new ArrayList<Producto>();

	
	
	
	//-------------------------------------------------------------
	public IProductoService getiProductoService() {
		return iProductoService;
	}

	public void setiProductoService(IProductoService iProductoService) {
		this.iProductoService = iProductoService;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getListProductos() {
		return listProductos = iProductoService.getAll();
	}

	public void setListProductos(List<Producto> listProductos) {
		this.listProductos = listProductos;
	}
	
}
