package pe.com.proygym.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_proveedores")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idProveedor;  
	@Column
	private String nombreCia; 
	@Column 
	private String nombreContacto; 
	@Column
	private String cargoContacto;
	@Column
	private String direccion; 
	@Column
	private String telefono;
	@Column
	private boolean estado;
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreCia() {
		return nombreCia;
	}
	public void setNombreCia(String nombreCia) {
		this.nombreCia = nombreCia;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getCargoContacto() {
		return cargoContacto;
	}
	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
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
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
