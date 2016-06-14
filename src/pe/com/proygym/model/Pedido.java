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
@Table(name = "tb_pedidos")
public class Pedido implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String idPedido;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaPedido;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaEntrega;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaEnvio;
	@Column
	private String direccionDestinatario;
	@Column
	private boolean estado;

	// Referencia a Distrito
	@ManyToOne
	@JoinColumn(name = "idDistrito")
	private Distrito oDistrito;
	// Referencia a Pedido
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario oUsuario;

	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public Distrito getoDistrito() {
		return oDistrito;
	}

	public void setoDistrito(Distrito oDistrito) {
		this.oDistrito = oDistrito;
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
