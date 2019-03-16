package persistencia;

import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManagerFactory;

public class PersistenciaHoteles {


	///--------------------------------------
	///---CONSTANTES
	///--------------------------------------
	
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaHoteles.class.getName());

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	///--------------------------------------
	///---ATRIBUTOS
	///--------------------------------------
	
	private static PersistenciaHoteles instance;
	
	private PersistenceManagerFactory pmf;
	
	private List<String> tablas;
	
	private SQLUtil sqlUtil;
}
