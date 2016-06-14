package pe.com.proygym.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_factura")
public class Factura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String numFac;  
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecFac;
	@Column
	private String estFac;  
	@Column
	private boolean estado;
	
	// Referencia a Usuario
	private List<Usuario> listUsuario = new ArrayList<Usuario>();

	public String getNumFac() {
		return numFac;
	}

	public void setNumFac(String numFac) {
		this.numFac = numFac;
	}

	public Date getFecFac() {
		return fecFac;
	}

	public void setFecFac(Date fecFac) {
		this.fecFac = fecFac;
	}

	public String getEstFac() {
		return estFac;
	}

	public void setEstFac(String estFac) {
		this.estFac = estFac;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}
	
	

}
