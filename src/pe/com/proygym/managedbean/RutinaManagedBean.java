package pe.com.proygym.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.google.common.collect.Lists;

import pe.com.proygym.model.Actividad;
import pe.com.proygym.model.Cliente;
import pe.com.proygym.model.Rutina;
import pe.com.proygym.model.Usuario;
import pe.com.proygym.service.ActividadServicio;
import pe.com.proygym.service.ClienteServices;
import pe.com.proygym.service.RutinaService;
import pe.com.proygym.service.UsuarioService;


@ManagedBean
@SessionScoped
public class RutinaManagedBean{

	@ManagedProperty(value = "#{rutinaService}")
	private RutinaService rutinaService;

	@ManagedProperty(value = "#{clienteServices}")
	private ClienteServices clienteServices;
	@ManagedProperty(value = "#{actividadServicio}")
	private ActividadServicio actividadServicio;

	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;

	private Rutina oRutina = new Rutina();
	private List<Rutina> listRutina = new ArrayList<Rutina>();
	
	private List<Usuario> listUsuario = new ArrayList<Usuario>();
	private List<Actividad> listActividad = new ArrayList<Actividad>();
	private List<Cliente> listCliente = new ArrayList<Cliente>();

	public RutinaService getRutinaService() {
		return rutinaService;
	}

	public void setRutinaService(RutinaService rutinaService) {
		this.rutinaService = rutinaService;
	}

	public ClienteServices getClienteServices() {
		return clienteServices;
	}

	public void setClienteServices(ClienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}

	public ActividadServicio getActividadServicio() {
		return actividadServicio;
	}

	public void setActividadServicio(ActividadServicio actividadServicio) {
		this.actividadServicio = actividadServicio;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	//------------------------------------------------------------------------------------------------------------

	public Rutina getoRutina() {
		return oRutina;
	}

	public void setoRutina(Rutina oRutina) {
		this.oRutina = oRutina;
	}

	public List<Rutina> getListRutina() {
		return listRutina;
	}

	public void setListRutina(List<Rutina> listRutina) {
		this.listRutina = listRutina;
	}

	public List<Usuario> getListUsuario() {
		listUsuario = Lists.newArrayList(usuarioService.getUsuarioRepository().findAll());	
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	public List<Actividad> getListActividad() {
		listActividad = Lists.newArrayList(actividadServicio.getActividadRepository().findAll());	
		return listActividad;
	}

	public void setListActividad(List<Actividad> listActividad) {
		this.listActividad = listActividad;
	}

	public List<Cliente> getListCliente() {
		listCliente = Lists.newArrayList(clienteServices.getClientRepository().findAll());	
		return listCliente;
	}

	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}
	public String registra(){
		
		return null;
	}
}
