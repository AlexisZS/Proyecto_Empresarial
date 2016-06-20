package pe.com.proygym.managedbean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pe.com.proygym.model.Distrito;
import pe.com.proygym.service.DistritoService;


@ManagedBean
@SessionScoped
public class DistritoManagedBean {
	
	@ManagedProperty(value="#{distritoService}")

	private DistritoService distritoService;
	
	private Distrito oDistrito = new  Distrito();
	
	private List<Distrito> listDistrito = new ArrayList<Distrito>();

	public DistritoService getDistritoService() {
		return distritoService;
	}

	public void setDistritoService(DistritoService distritoService) {
		this.distritoService = distritoService;
	}

	public Distrito getoDistrito() {
		return oDistrito;
	}

	public void setoDistrito(Distrito oDistrito) {
		this.oDistrito = oDistrito;
	}

	public List<Distrito> getListDistrito() {
		Iterable<Distrito> it = distritoService.getDistritoRepository().findAll();
		Iterator<Distrito> iterator = it.iterator();
		
		listDistrito.clear();
		
		while(iterator.hasNext()){
			listDistrito.add(iterator.next());
		}
		
		return listDistrito;
	}

	public void setListDistrito(List<Distrito> listDistrito) {
		this.listDistrito = listDistrito;
	}

    public String registrar(){
	
	distritoService.getDistritoRepository().save(oDistrito);
	oDistrito = new Distrito();
	return null;
}

}
