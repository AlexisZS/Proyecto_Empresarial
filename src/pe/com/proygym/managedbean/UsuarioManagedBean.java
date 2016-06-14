package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.google.common.collect.Lists;

import pe.com.proygym.model.Usuario;
import pe.com.proygym.service.UsuarioService;



@ManagedBean
@SessionScoped
public class UsuarioManagedBean {

	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;

	//Referencia a tabla usuario
	private Usuario oUsuario= new  Usuario();
	//Referencia a la  Lista Usuarios
	private List<Usuario> listUsuario = new ArrayList<Usuario>();
	
	
	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public List<Usuario> getListUsuario() {
//		listUsuario = Lists.newArrayList(usuarioService.getUsuarioRepository().findAll());
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
	
	
}
