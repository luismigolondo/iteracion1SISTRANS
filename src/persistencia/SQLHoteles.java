package persistencia;

public class SQLHoteles {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicaci�n
	 */
	private PersistenciaHoteles ph;

	/* ****************************************************************
	 * 			M�todos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param ph - El Manejador de persistencia de la aplicaci�n
	 */
	public SQLHoteles(PersistenciaHoteles ph)
	{
		this.ph = ph;
	}
}
