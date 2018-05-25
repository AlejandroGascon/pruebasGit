package es.gscn.bean.utilidadesxml;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("entorno")


public class Entorno {
	 @XStreamAsAttribute
     private String name;
	@XStreamAlias("usuario")
	private String usuario;
	@XStreamAlias("password")
	private String password;
	@XStreamAlias("domain")
	private String domain;
	@XStreamAlias("data.dir")
	private String datadir;
	@XStreamAlias("dfc.tokenstorage.dir")
	private String dfctokenstoragedir;
	@XStreamAlias("dfc.docbroker")
	private DfcDocbroker dfcdocbroker;
	@XStreamAlias("dfc.globalregistry")
	private DfcGlobalregistry dfcGlobalRegistry;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the dfcdocbroker
	 */
	public DfcDocbroker getDfcdocbroker() {
		return dfcdocbroker;
	}
	/**
	 * @param dfcdocbroker the dfcdocbroker to set
	 */
	public void setDfcdocbroker(DfcDocbroker dfcdocbroker) {
		this.dfcdocbroker = dfcdocbroker;
	}
	/**
	 * @return the dfcGlobalregistry
	 */
	public DfcGlobalregistry getDfcGlobalregistry() {
		return dfcGlobalRegistry;
	}
	/**
	 * @param dfcGlobalregistry the dfcGlobalregistry to set
	 */
	public void setDfcGlobalregistry(DfcGlobalregistry dfcGlobalregistry) {
		dfcGlobalRegistry = dfcGlobalregistry;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/**
	 * @return the datadir
	 */
	public String getDatadir() {
		return datadir;
	}
	/**
	 * @param datadir the datadir to set
	 */
	public void setDatadir(String datadir) {
		this.datadir = datadir;
	}
	/**
	 * @return the dfctokenstoragedir
	 */
	public String getDfctokenstoragedir() {
		return dfctokenstoragedir;
	}
	/**
	 * @param dfctokenstoragedir the dfctokenstoragedir to set
	 */
	public void setDfctokenstoragedir(String dfctokenstoragedir) {
		this.dfctokenstoragedir = dfctokenstoragedir;
	}
	
	
	
	

}
