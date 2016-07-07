package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.common.collect.Lists;

import pe.com.proygym.model.Proveedor;
import pe.com.proygym.service.ProveedorServicio;

@ManagedBean
@SessionScoped
public class ProveedorManagedBean {

	private Proveedor oProveedor = new Proveedor();
	@ManagedProperty(value = "#{proveedorServicio}")
	private ProveedorServicio proveedorServicio;
	private List<Proveedor> listProveedor = new ArrayList<Proveedor>();
	private List<Proveedor> listProveedores = new ArrayList<Proveedor>();

	public List<Proveedor> getListProveedores() {
		listProveedores = Lists.newArrayList(proveedorServicio.getProveedorRepository().findAll());
		return listProveedores;
	}

	public void setListProveedores(List<Proveedor> listProveedores) {
		this.listProveedores = listProveedores;
	}

	public Proveedor getoProveedor() {
		return oProveedor;
	}

	public void setoProveedor(Proveedor oProveedor) {
		this.oProveedor = oProveedor;
	}

	public ProveedorServicio getProveedorServicio() {
		return proveedorServicio;
	}

	public void setProveedorServicio(ProveedorServicio proveedorServicio) {
		this.proveedorServicio = proveedorServicio;
	}

	public List<Proveedor> getListProveedor() {
		return listProveedor;
	}

	public void setListProveedor(List<Proveedor> listProveedor) {
		this.listProveedor = listProveedor;
	}

	public String registro() {

		proveedorServicio.getProveedorRepository().save(oProveedor);
		return "listaProveedores";
	}

	public String actualiza() {
		FacesContext context = FacesContext.getCurrentInstance();
		Map params = context.getExternalContext().getRequestParameterMap();
		String paramId = (String) params.get("id");

		oProveedor = proveedorServicio.getProveedorRepository().findOne(
				new String(paramId));
		return "actualizaProveedor";
	}

	public String buscar() {
		listProveedor = Lists.newArrayList(proveedorServicio
				.getProveedorRepository().obtenerSeriesPorId(
						oProveedor.getNombreCia()));

		return null;
	}
}
