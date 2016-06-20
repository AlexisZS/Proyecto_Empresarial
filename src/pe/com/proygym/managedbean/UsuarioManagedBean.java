package pe.com.proygym.managedbean;

import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.google.common.collect.Lists;

import pe.com.proygym.model.Distrito;
import pe.com.proygym.model.TipoUsuario;
import pe.com.proygym.model.Usuario;
import pe.com.proygym.service.DistritoService;
import pe.com.proygym.service.TipoUsuarioService;
import pe.com.proygym.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {

	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;

	@ManagedProperty(value = "#{distritoService}")
	private DistritoService distritoService;
	
	@ManagedProperty(value = "#{tipoUsuarioService}")
	private TipoUsuarioService tipoUsuarioService;

	// Referencia a tabla usuario
	private Usuario oUsuario = new Usuario();
	// Referencia a la Lista Usuarios
	private List<Usuario> listUsuario = new ArrayList<Usuario>();
	// Referencia a distritos
	private List<Distrito> listDistrito = new ArrayList<Distrito>();

	private List<TipoUsuario> listTipoUsuario = new ArrayList<TipoUsuario>();

	
	

	public TipoUsuarioService getTipoUsuarioService() {
		return tipoUsuarioService;
	}

	public void setTipoUsuarioService(TipoUsuarioService tipoUsuarioService) {
		this.tipoUsuarioService = tipoUsuarioService;
	}

	public List<TipoUsuario> getListTipoUsuario() {
		listTipoUsuario = Lists.newArrayList(tipoUsuarioService
				.getTipoUsuarioRepository().findAll());

		return listTipoUsuario;
	}

	public void setListTipoUsuario(List<TipoUsuario> listTipoUsuario) {
		this.listTipoUsuario = listTipoUsuario;
	}

	public DistritoService getDistritoService() {
		return distritoService;
	}

	public void setDistritoService(DistritoService distritoService) {
		this.distritoService = distritoService;
	}

	public List<Distrito> getListDistrito() {
		listDistrito = Lists.newArrayList(distritoService
				.getDistritoRepository().findAll());

		return listDistrito;
	}

	public void setListDistrito(List<Distrito> listDistrito) {
		this.listDistrito = listDistrito;
	}

	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public List<Usuario> getListUsuario() {
		listUsuario = Lists.newArrayList(usuarioService.getUsuarioRepository()
				.findAll());
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public String registrar() {
		usuarioService.getUsuarioRepository().save(oUsuario);
		return null;
	}

}
