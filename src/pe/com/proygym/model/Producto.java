package pe.com.proygym.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_productos")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idProd;
	@Column
	private String nomPro;
	@Column
	private int disponible;
	@Column
	private double precio;
	@Column
	private String imagen;
	@Column
	private boolean estado;
	// referencia a Proveedor
	@ManyToOne
	@JoinColumn(name="idProveedor")
	private Proveedor oProvedor;
	// referencia a Categoria
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria oCategoria;

	public String getIdProd() {
		return idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	public String getNomPro() {
		return nomPro;
	}

	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Proveedor getoProvedor() {
		return oProvedor;
	}

	public void setoProvedor(Proveedor oProvedor) {
		this.oProvedor = oProvedor;
	}

	public Categoria getoCategoria() {
		return oCategoria;
	}

	public void setoCategoria(Categoria oCategoria) {
		this.oCategoria = oCategoria;
	}



}
