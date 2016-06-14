package pe.com.proygym.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_detalle_pedido")
public class DetallePedido implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idDetallePed;
	@Column
	private int cantidad;  
	@Column
	private double precioTotal;
	
	//Referencia a Pedido
	@ManyToOne
	@JoinColumn(name="idPedido")
    private Pedido oPedido;
	//Referencia a Pedido
	@ManyToOne
	@JoinColumn(name="idProd")
    private Producto  oProducto;
	
	
	public Pedido getoPedido() {
		return oPedido;
	}
	public void setoPedido(Pedido oPedido) {
		this.oPedido = oPedido;
	}
	public Producto getoProducto() {
		return oProducto;
	}
	public void setoProducto(Producto oProducto) {
		this.oProducto = oProducto;
	}
	public String getIdDetallePed() {
		return idDetallePed;
	}
	public void setIdDetallePed(String idDetallePed) {
		this.idDetallePed = idDetallePed;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
    
    
    
}
