package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.common.collect.Lists;

import pe.com.proygym.model.Categoria;
import pe.com.proygym.model.Producto;
import pe.com.proygym.model.Proveedor;
import pe.com.proygym.service.CategoriaServicio;
import pe.com.proygym.service.ProductoService;
import pe.com.proygym.service.ProveedorServicio;

@ManagedBean
@SessionScoped
public class ProductoManagedBean {
//productoManagedBean
	
	@ManagedProperty(value = "#{productoService}")
	private ProductoService productoService;

	@ManagedProperty(value = "#{proveedorServicio}")
	private ProveedorServicio proveedorServicio;

	@ManagedProperty(value = "#{categoriaServicio}")
	private CategoriaServicio categoriaServicio;

	private Producto producto = new Producto();
	private Proveedor proveedor = new Proveedor();
	private Categoria categoria = new Categoria();

	List<Producto> listProductos = new ArrayList<Producto>();
	List<Proveedor> listProveedores = new ArrayList<Proveedor>();
	List<Categoria> listCategorias = new ArrayList<Categoria>();

	String categoriaSeleccionada;
	String proveedorSeleccionado;
	// -------------------------------------------------------------

	
	public String registrar(){
		proveedor = proveedorServicio.getProveedorRepository().findOne(proveedorSeleccionado);
		categoria = categoriaServicio.getOne(categoriaSeleccionada);
		producto.setoProvedor(proveedor);
		producto.setoCategoria(categoria);
		producto.setImagen("url/default");
		productoService.create(producto);
		producto = new Producto();
		return "registroProducto";
	}
	
	public String paseEditar(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		Map params = context.getExternalContext().getRequestParameterMap();
		String paramId = (String) params.get("idProd");
		
		producto = productoService.getProducto(new String(paramId));
		
		
		return "updateProducto";
	}
	
	public String editar(){
		proveedor = proveedorServicio.getProveedorRepository().findOne(proveedorSeleccionado);
		categoria = categoriaServicio.getOne(categoriaSeleccionada);
		producto.setoProvedor(proveedor);
		producto.setoCategoria(categoria);
		producto.setImagen("url/default");
		productoService.update(producto);
		producto = new Producto();
		return "listadoProductos";
	}
	
	
	//---------------------------------------------------------------
	
	public String getCategoriaSeleccionada() {
		return categoriaSeleccionada;
	}

	public void setCategoriaSeleccionada(String categoriaSeleccionada) {
		this.categoriaSeleccionada = categoriaSeleccionada;
	}

	public String getProveedorSeleccionado() {
		return proveedorSeleccionado;
	}

	public void setProveedorSeleccionado(String proveedorSeleccionado) {
		this.proveedorSeleccionado = proveedorSeleccionado;
	}

	
	public ProveedorServicio getProveedorServicio() {
		return proveedorServicio;
	}

	public void setProveedorServicio(ProveedorServicio proveedorServicio) {
		this.proveedorServicio = proveedorServicio;
	}

	public CategoriaServicio getCategoriaServicio() {
		return categoriaServicio;
	}

	public void setCategoriaServicio(CategoriaServicio categoriaServicio) {
		this.categoriaServicio = categoriaServicio;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Proveedor> getListProveedores() {
		listProveedores = Lists.newArrayList(proveedorServicio.getProveedorRepository().findAll());
		return listProveedores;
	}

	public void setListProveedores(List<Proveedor> listProveedores) {
		this.listProveedores = listProveedores;
	}

	public List<Categoria> getListCategorias() {
		listCategorias = Lists.newArrayList(categoriaServicio.getAll());
		return listCategorias;
	}

	public void setListCategorias(List<Categoria> listCategorias) {
		this.listCategorias = listCategorias;
	}

	
	public ProductoService getProductoService() {
		return productoService;
	}

	public void setProductoService(ProductoService productoService) {
		this.productoService = productoService;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getListProductos() {
		listProductos = Lists.newArrayList(productoService.getAll());
		return listProductos;
	}

	public void setListProductos(List<Producto> listProductos) {
		this.listProductos = listProductos;
	}

}
