package es.gscn.bean.utilidadesxml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("sesionconfiguracion")
public class SesionConfiguracion {
	@XStreamImplicit
	private List <Cliente> cliente = null;

	/**
	 * @return the cliente
	 */
	public List<Cliente> getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	

}
