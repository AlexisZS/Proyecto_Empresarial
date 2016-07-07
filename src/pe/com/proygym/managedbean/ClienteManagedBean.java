package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Cliente;
import pe.com.proygym.model.Distrito;
import pe.com.proygym.model.Usuario;
import pe.com.proygym.service.ClienteServices;
import pe.com.proygym.service.DistritoService;



@ManagedBean
@SessionScoped
public class ClienteManagedBean {
	@ManagedProperty(value="#{clienteServices}")
	private ClienteServices clienteServices;
	
	@ManagedProperty(value = "#{distritoService}")
	private DistritoService distritoService;
	
	private Usuario oUsuario = new Usuario();
	// Referencia a la Lista Usuarios
	private List<Cliente> listClientes = new ArrayList<Cliente>();
	// Referencia a distritos
	private List<Distrito> listDistrito = new ArrayList<Distrito>();
	public ClienteServices getClienteServices() {
		return clienteServices;
	}
	public void setClienteServices(ClienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}
	public DistritoService getDistritoService() {
		return distritoService;
	}
	public void setDistritoService(DistritoService distritoService) {
		this.distritoService = distritoService;
	}
	public Usuario getoUsuario() {
		return oUsuario;
	}
	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}
	public List<Cliente> getListClientes() {
		return listClientes;
	}
	public void setListClientes(List<Cliente> listClientes) {
		this.listClientes = listClientes;
	}
	public List<Distrito> getListDistrito() {
		return listDistrito;
	}
	public void setListDistrito(List<Distrito> listDistrito) {
		this.listDistrito = listDistrito;
	}

}
