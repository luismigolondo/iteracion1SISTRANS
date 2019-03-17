package persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

/**
 * Clase que encapsula los métodos que hacen acceso a la base de datos para el concepto BEBEDOR de Parranderos
 * Nótese que es una clase que es sólo conocida en el paquete de persistencia
 * MODIFICADO POR LUIS MIGUEL GÓMEZ Y JUAN DAVID DIAZ
 * 
 * @author Germán Bravo
 */
public class SQLReservas_Habitaciones {

	private final static String SQL = PersistenciaCadenaHoteles.SQL;
	
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

	public long registrarSalidaCliente(PersistenceManager pm, long idReserva) {
		// TODO Auto-generated method stub
		Query q = pm.newQuery(SQL,"UPDATE "+ ph.darTablaReservasHabitaciones() + " SET CHECKED_OUT = ?");
		q.setParameters(1);
		return (long) q.executeUnique();
	}

	public long registrarLlegadaCliente(PersistenceManager pm, long pIdReserva) {
		Query q = pm.newQuery(SQL,"UPDATE "+ ph.darTablaReservasHabitaciones() + " SET CHECKED_IN = ?");
		q.setParameters(1);
		return (long) q.executeUnique();
	}
}
