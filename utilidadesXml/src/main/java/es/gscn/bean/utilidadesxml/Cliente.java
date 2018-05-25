package es.gscn.bean.utilidadesxml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("cliente")
public class Cliente {

	@XStreamAsAttribute
	private String name;

	@XStreamAlias("entorno")
	@XStreamImplicit
	private List<Entorno> entorno;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the entorno
	 */
	public List<Entorno> getEntorno() {
		return entorno;
	}

	/**
	 * @param entorno
	 *            the entorno to set
	 */
	public void setEntorno(List<Entorno> entorno) {
		this.entorno = entorno;
	}

}
