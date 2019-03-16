package persistencia;

public class SQLPrestamos {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaHoteles ph;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param ph - El Manejador de persistencia de la aplicación
	 */
	public SQLPrestamos(PersistenciaHoteles ph)
	{
		this.ph = ph;
	}
}
