package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Actividad;
import pe.com.proygym.service.ActividadServicio;
import pe.com.proygym.service.ClienteServices;


@ManagedBean
@SessionScoped
public class ActividadMangedBean {

	@ManagedProperty(value="#{actividadServicio}")
	private ActividadServicio actividadServicio;
	
	private Actividad oActividad = new Actividad();
	
	private List<Actividad> listActividad = new ArrayList<Actividad>();

	public ActividadServicio getActividadServicio() {
		return actividadServicio;
	}

	public void setActividadServicio(ActividadServicio actividadServicio) {
		this.actividadServicio = actividadServicio;
	}

	public Actividad getoActividad() {
		return oActividad;
	}

	public void setoActividad(Actividad oActividad) {
		this.oActividad = oActividad;
	}

	public List<Actividad> getListActividad() {
		return listActividad;
	}

	public void setListActividad(List<Actividad> listActividad) {
		this.listActividad = listActividad;
	}
	
	
}
