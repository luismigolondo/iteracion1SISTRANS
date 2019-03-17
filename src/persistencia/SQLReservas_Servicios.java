package persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLReservas_Servicios {

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
	public SQLReservas_Servicios(PersistenciaCadenaHoteles ph)
	{
		this.ph = ph;
	}

	public long adicionarReserva(PersistenceManager pm, long id, String horaInicio, String horaFin,
			long pIdCliente, long pIdTipoId, long servicio) {
		Query q = pm.newQuery(SQL, "INSERT INTO " + ph.darTablaReservasServicios() + "(ID, ID_CLIENTE, TIPO_IDENTIFICACION, "
				+ "ID_SERVICIO, HORA_APERTURA, HORA_CIERRE) VALUES (?, ?, ?, ?, ?, ?)");
		q.setParameters(id, pIdCliente, pIdTipoId, servicio, horaInicio, horaFin);
		return (long) q.executeUnique();
	}

}
