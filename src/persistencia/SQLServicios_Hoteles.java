package persistencia;

public class SQLServicios_Hoteles {

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
	public SQLServicios_Hoteles(PersistenciaHoteles ph)
	{
		this.ph = ph;
	}
}
