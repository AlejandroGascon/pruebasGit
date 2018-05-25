/**
 * 
 * Clase para el manejo de sesiones. Conectar y cerrar sesiones con un sesion manager que maneja la clase.
 * - Es un sesion manager para un solo repositorio.
 * - Se conectan sesiones compartidas, no privadas.
 */

package es.gscn.sesiones;

import java.io.File;

import com.documentum.com.DfClientX;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.DfLoginInfo;
import com.documentum.fc.common.IDfLoginInfo;

/**
 * 
 * 
 * @author agascon
 * @since 08/05/2018
 * @version 0.1
 * 
 * 
 */
public class DctmSesiones {

	private static final String DFCPROPERTIESFILE = "dfc.properties.file";
	/*
	 * Sesion manager
	 */
	private IDfSessionManager idfSessionManager;
	/*
	 * Docbase
	 */
	private String cDocbase;

	private DfClientX clientx;
	private IDfClient client;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param pInDocbase
	 *            Docbase hacia donde se conectará.
	 * @throws DfException
	 * 
	 */
	public DctmSesiones(String pInDocbase) throws DfException {
		super();

		cDocbase = pInDocbase;
		obtenerSessionManager();
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param pInDocbase
	 *            Docbase hacia donde se conectará.
	 * @throws DfException
	 * 
	 */
	public DctmSesiones(File pInDFCProperties, String pInDocbase) throws DfException {
		super();

		if (pInDFCProperties.exists()) {
			System.setProperty(DFCPROPERTIESFILE, pInDFCProperties.getAbsolutePath());
		}
		cDocbase = pInDocbase;
		obtenerSessionManager();

	}

	/**
	 * Metodo auxiliar que inicializa el sessionmanager
	 * 
	 * @throws DfException
	 */
	private void obtenerSessionManager() throws DfException {
		clientx = new DfClientX();

		client = clientx.getLocalClient();
		idfSessionManager = client.newSessionManager();

	}

	/**
	 * metodo para abrir una sesion compartida con el repositorio
	 * 
	 * @param pInUser
	 *            Usuario
	 * @param pInPassword
	 *            Password
	 * @return
	 * @throws DfException
	 */
	public IDfSession conectar(String pInUser, String pInPassword) throws DfException {
		IDfSession idfSession;

		idfSession = obtenerSession(pInUser, pInPassword, "");

		return idfSession;
	}

	/**
	 * 
	 * metodo para abrir una sesion compartida con el repositorio
	 * 
	 * @param pInUser
	 *            Usuario
	 * @param pInPassword
	 *            Password
	 * @param pInDomain
	 *            Dominio
	 * @return
	 * @throws DfException
	 */
	public IDfSession conectar(String pInUser, String pInPassword, String pInDomain) throws DfException {
		IDfSession idfSession;

		idfSession = obtenerSession(pInUser, pInPassword, pInDomain);

		return idfSession;
	}

	/**
	 * Metodo auxiliar para la obtenccion de sesiones
	 * 
	 * @param pInUser
	 *            Usuario
	 * @param pInPassword
	 *            Password
	 * @param pInDomain
	 *            Dominio
	 * @return
	 * @throws DfException
	 */
	private IDfSession obtenerSession(String pInUser, String pInPassword, String pInDomain) throws DfException {
		IDfLoginInfo li = new DfLoginInfo();
		IDfSession idfSession;
		li.setUser(pInUser);
		li.setPassword(pInPassword);
		li.setDomain(pInDomain);

		if (idfSessionManager.hasIdentity(cDocbase)) {
			idfSessionManager.clearIdentity(cDocbase);
		}
		idfSessionManager.setIdentity(cDocbase, li);
		idfSession = idfSessionManager.getSession(cDocbase);

		return idfSession;
	}

	/**
	 * Metodo que desconecta la sesion.
	 * 
	 * @param pInIDfSession
	 * @throws DfException
	 * 
	 */
	public void desconectar(IDfSession pInIDfSession) throws DfException {

		if (pInIDfSession != null) {
			idfSessionManager.release(pInIDfSession);

		}
		idfSessionManager.flushSessions();
	}

	/*
	 * 
	 * 
	 * 
	 * TRANSACCIONES
	 * 
	 * 
	 * 
	 * 
	 */

	/**
	 * Abre una transaccion en la sesion
	 * 
	 * @param pInIDfSession
	 * @throws DfException
	 */
	public void beginTrans(IDfSession pInIDfSession) throws DfException {

		if (!pInIDfSession.isTransactionActive()) {
			pInIDfSession.beginTrans();
		}

	}

	/**
	 * 
	 * Hace commit en la transaccion activa de la sesion
	 * 
	 * @param pInIDfSession
	 * @throws DfException
	 */
	public void commitTrans(IDfSession pInIDfSession) throws DfException {

		if (pInIDfSession.isTransactionActive()) {

			pInIDfSession.commitTrans();
		}

	}

	/**
	 * 
	 * Hace rollback a la sesion
	 * 
	 * @param pInIDfSession
	 * @throws DfException
	 */
	public void rollBackTransaccion(IDfSession pInIDfSession) throws DfException {

		if (pInIDfSession.isTransactionActive()) {
			pInIDfSession.abortTrans();
		}

	}

}
