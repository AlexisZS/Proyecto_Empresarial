package pe.com.proygym.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_detallerutinas")
public class Rutina implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idRutina;
	@Column
	private int item;
	@Column
	private String comentario;
	@Column
	private String logro;
	@Column
	private int serie;
	@Column
	private String rutina;
	@Column
	private String recomendaciones;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column
	private int canthoras;

	@ManyToOne
	@JoinColumn(name="idActividad")
	private Actividad oActividad = new Actividad();
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario oUsuario = new Usuario();
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente oCliente = new Cliente();
	
	
	public String getIdRutina() {
		return idRutina;
	}
	public void setIdRutina(String idRutina) {
		this.idRutina = idRutina;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getLogro() {
		return logro;
	}
	public void setLogro(String logro) {
		this.logro = logro;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getRutina() {
		return rutina;
	}
	public void setRutina(String rutina) {
		this.rutina = rutina;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCanthoras() {
		return canthoras;
	}
	public void setCanthoras(int canthoras) {
		this.canthoras = canthoras;
	}
	public Actividad getoActividad() {
		return oActividad;
	}
	public void setoActividad(Actividad oActividad) {
		this.oActividad = oActividad;
	}
	public Usuario getoUsuario() {
		return oUsuario;
	}
	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}
	public Cliente getoCliente() {
		return oCliente;
	}
	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}
	
	
}
