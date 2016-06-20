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
@Table(name = "tb_distritos")
public class Distrito implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private Integer idDistrito;
	@Column
	private String nomDistrito;
	
     @OneToMany(mappedBy="oDistrito",cascade=CascadeType.PERSIST)
     private List<Usuario> listUsuario = new ArrayList<Usuario>();
     
     
	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	public Distrito(Integer idDistrito, String nomDistrito) {
		
		this.idDistrito = idDistrito;
		this.nomDistrito = nomDistrito;
	}
	
	public Distrito() {
		
	}
	public Integer getIdDistrito() {
		return idDistrito;
	}



	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getNomDistrito() {
		return nomDistrito;
	}
	public void setNomDistrito(String nomDistrito) {
		this.nomDistrito = nomDistrito;
	}
	
}
