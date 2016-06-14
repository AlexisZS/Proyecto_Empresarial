package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import pe.com.proygym.model.Usuario;
import pe.com.proygym.service.UsuarioService;


@ManagedBean
@SessionScoped
public class LogeoManagedBean {
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;
	
	//Referencia a tabla usuario
	private Usuario oUsuario= new  Usuario();
	//Referencia a la  Lista Usuarios
	
	private List<Usuario> listUsuario = new ArrayList<Usuario>();
	
	public boolean isLogeado() {
		return logeado;
	}

	public void setLogeado(boolean logeado) {
		this.logeado = logeado;
	}

	private boolean logeado = false;
	
   
	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public List<Usuario> getListUsuario() {
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
	
	
		public String login(){
			RequestContext context = RequestContext.getCurrentInstance();
//			FacesMessage msg = null;
//			if (oUsuario.getCorreo() != null && 
//				 oUsuario.getClave()!= null ) {
			//logeado = true;
//			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", oUsuario.getNombre());
//			} else {
			//logeado = false;
//			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
//			"Credenciales no válidas");
			
		
//			FacesContext.getCurrentInstance().addMessage(null, msg);
//			context.addCallbackParam("estaLogeado", logeado);
		   //if (logeado)
		  //	context.addCallbackParam("view", "gauge.xhtml");
			return "index";
		}
		
		 public void logout() {
			 HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
			 .getExternalContext().getSession(false);
			 session.invalidate();
			 logeado = false;
			 
			 } 
	
}
