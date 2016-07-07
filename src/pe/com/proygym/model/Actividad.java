package pe.com.proygym.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_actividades")
public class Actividad implements Serializable{
	
	
	@Id
	@Column
	private String idActividad; 
	@Column
	private String descrip;
	
	 @OneToMany(mappedBy="oActividad",cascade=CascadeType.PERSIST)
     private List<Rutina> listRutina = new ArrayList<Rutina>();
	
	public List<Rutina> getListRutina() {
		return listRutina;
	}
	public void setListRutina(List<Rutina> listRutina) {
		this.listRutina = listRutina;
	}
	public String getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(String idActividad) {
		this.idActividad = idActividad;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	

}
