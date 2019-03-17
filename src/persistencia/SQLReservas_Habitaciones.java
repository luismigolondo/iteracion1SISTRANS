package persistencia;

import javax.jdo.PersistenceManager;

public class SQLReservas_Habitaciones {

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicaci�n
	 */
	private PersistenciaCadenaHoteles ph;

	/* ****************************************************************
	 * 			M�todos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param ph - El Manejador de persistencia de la aplicaci�n
	 */
	public SQLReservas_Habitaciones(PersistenciaCadenaHoteles ph)
	{
		this.ph = ph;
	}

	public long adicionarReserva(PersistenceManager pm, long pId, long pIdCliente, long pIdTipoId, long pIdHabitacion,
			long pIdPlanDeConsumo, String pFechaInicio, String pFechaFin) {
		// TODO Auto-generated method stub
		return 0;
	}
}
