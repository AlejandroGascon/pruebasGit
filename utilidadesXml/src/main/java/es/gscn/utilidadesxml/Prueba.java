package es.gscn.utilidadesxml;


import java.io.InputStream;

import com.thoughtworks.xstream.XStream;
import es.gscn.bean.utilidadesxml.SesionConfiguracion;

/**
 * @author agascon
 *
 */
class Prueba {
	
	private Prueba(){
		  // Sonar quality 
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream file =   ClassLoader.getSystemResourceAsStream("dfcproperties.xml");

		XStream xStream = new XStream();
		xStream.processAnnotations(SesionConfiguracion.class);

		SesionConfiguracion sesionConfiguracion = (SesionConfiguracion) xStream.fromXML(file);
		System.out.println(sesionConfiguracion.getCliente().get(0).getName());

	}

}
