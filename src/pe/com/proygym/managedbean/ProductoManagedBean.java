package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Producto;
import pe.com.proygym.service.ProductoService;


@ManagedBean
@SessionScoped
public class ProductoManagedBean {
	
	@ManagedProperty(value = "#{productoServiceImpl}")
	private ProductoService productoService;
	
	private Producto producto = new Producto();
	
	List<Producto> listProductos = new ArrayList<Producto>();

	
	
	
	//-------------------------------------------------------------

	
	
	

}
