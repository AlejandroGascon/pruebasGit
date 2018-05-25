package es.gscn.bean.utilidadesxml;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("dfc.docbroker")
public class DfcDocbroker {
	@XStreamAlias("host")
	private String host;
	@XStreamAlias("port")
	private String port;
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
	
}
