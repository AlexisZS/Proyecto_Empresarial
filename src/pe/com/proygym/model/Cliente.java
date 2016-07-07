package pe.com.proygym.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idCliente; 
	@Column
	private String clave; 
	@Column
	private String nombre;
	@Column
	private String apePaterno;
	@Column
	private String apeMaterno;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecNac;
	@Column
	private String correo;
	@Column
	private String direccion;
	@Column
	private String telefono;
	@Column
	private double peso;
	@Column
	private double talla;
	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public List<Rutina> getListRutina() {
		return listRutina;
	}


	public void setListRutina(List<Rutina> listRutina) {
		this.listRutina = listRutina;
	}


	@Column
	private boolean estado;
	
//     private String nombreCompleto;
//	
//	
//	public String getNombreCompleto() {
//		return nombreCompleto+" "+apePaterno;
//	}

	//Referencia a Distrito
	@ManyToOne
	@JoinColumn(name="idDistrito")
		private Distrito oDistrito = new Distrito();

	 @OneToMany(mappedBy="oCliente",cascade=CascadeType.PERSIST)
     private List<Rutina> listRutina = new ArrayList<Rutina>();

	public String getIdUsuario() {
		return idCliente;
	}


	public void setIdUsuario(String idCliente) {
		this.idCliente = idCliente;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApePaterno() {
		return apePaterno;
	}


	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}


	public String getApeMaterno() {
		return apeMaterno;
	}


	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}


	public Date getFecNac() {
		return fecNac;
	}


	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getTalla() {
		return talla;
	}


	public void setTalla(double talla) {
		this.talla = talla;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Distrito getoDistrito() {
		return oDistrito;
	}


	public void setoDistrito(Distrito oDistrito) {
		this.oDistrito = oDistrito;
	}
		
	

	
}
