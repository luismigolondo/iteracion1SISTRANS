package persistencia;

public class SQLReservas_Habitaciones {

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
	public SQLReservas_Habitaciones(PersistenciaCadenaHoteles ph)
	{
		this.ph = ph;
	}
}
