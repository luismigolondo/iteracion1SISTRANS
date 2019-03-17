package persistencia;

public class SQLReservas_Servicios {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaCadenaHoteles ph;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param ph - El Manejador de persistencia de la aplicación
	 */
	public SQLReservas_Servicios(PersistenciaCadenaHoteles ph)
	{
		this.ph = ph;
	}
}
