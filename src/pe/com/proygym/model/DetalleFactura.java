package pe.com.proygym.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_detalle_factura")
public class DetalleFactura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idDetFac; 
	@Column
	private String numFac;  
	@Column
	private int canVend;  
	@Column
	private double preVenta;
	
	//Referencia a Pedido
	@ManyToOne
	@JoinColumn(name = "idProd")
    private Producto oProducto;

	public String getIdDetFac() {
		return idDetFac;
	}

	public void setIdDetFac(String idDetFac) {
		this.idDetFac = idDetFac;
	}

	public String getNumFac() {
		return numFac;
	}

	public void setNumFac(String numFac) {
		this.numFac = numFac;
	}

	public int getCanVend() {
		return canVend;
	}

	public void setCanVend(int canVend) {
		this.canVend = canVend;
	}

	public double getPreVenta() {
		return preVenta;
	}

	public void setPreVenta(double preVenta) {
		this.preVenta = preVenta;
	}

	public Producto getListProducto() {
		return oProducto;
	}

	public void setListProducto(Producto oProducto) {
		this.oProducto = oProducto;
	}

}
