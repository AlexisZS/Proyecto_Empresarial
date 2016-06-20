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
@Table(name = "tb_tipo_usuario")
public class TipoUsuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private Integer idTipoUsu;
	@Column
	private String desTipoUsu;
	
	
	@OneToMany(mappedBy="oTipoUsuario",cascade=CascadeType.PERSIST)
    private List<Usuario> listUsuario = new ArrayList<Usuario>();
	
	public Integer getIdTipoUsu() {
		return idTipoUsu;
	}
	public void setIdTipoUsu(Integer idTipoUsu) {
		this.idTipoUsu = idTipoUsu;
	}
	public String getDesTipoUsu() {
		return desTipoUsu;
	}
	public void setDesTipoUsu(String desTipoUsu) {
		this.desTipoUsu = desTipoUsu;
	}
	
	
}
