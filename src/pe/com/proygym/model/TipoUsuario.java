package pe.com.proygym.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private int idTipoUsu;
	@Column
	private String desTipoUsu;
	public int getIdTipoUsu() {
		return idTipoUsu;
	}
	public void setIdTipoUsu(int idTipoUsu) {
		this.idTipoUsu = idTipoUsu;
	}
	public String getDesTipoUsu() {
		return desTipoUsu;
	}
	public void setDesTipoUsu(String desTipoUsu) {
		this.desTipoUsu = desTipoUsu;
	}
	
	
}
