package persistencia;

public class SQLGastos {

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
	public SQLGastos(PersistenciaHoteles ph)
	{
		this.ph = ph;
	}
}
