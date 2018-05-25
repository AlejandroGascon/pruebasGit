package es.gscn.bean.utilidadesxml;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("dfc.globalregistry")
public class DfcGlobalregistry {
	@XStreamAlias("repository")
	private String repository;
	@XStreamAlias("username")
	private String username;
	@XStreamAlias("password")
	private String password;
	/**
	 * @return the repository
	 */
	public String getRepository() {
		return repository;
	}
	/**
	 * @param repository the repository to set
	 */
	public void setRepository(String repository) {
		this.repository = repository;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	
	
	
}
