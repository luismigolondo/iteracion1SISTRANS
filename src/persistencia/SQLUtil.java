package persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLUtil {

	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra ac� para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaCadenaHoteles.SQL;
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicaci�n
	 */
	private PersistenciaCadenaHoteles pp;
	
	/* ****************************************************************
	 * 			M�todos
	 *****************************************************************/
	
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicaci�n
	 */
	public SQLUtil (PersistenciaCadenaHoteles pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Crea y ejecuta la sentencia SQL para obtener un nuevo n�mero de secuencia
	 * @param pm - El manejador de persistencia
	 * @return El n�mero de secuencia generado
	 */
	public long nextval (PersistenceManager pm)
	{
        Query q = pm.newQuery(SQL, "SELECT "+ pp.darSeqCadenaHoteles() + ".nextval FROM DUAL");
        q.setResultClass(Long.class);
        long resp = (long) q.executeUnique();
        return resp;
	}
	
	/**
	 * Crea y ejecuta las sentencias SQL para cada tabla de la base de datos - EL ORDEN ES IMPORTANTE 
	 * @param pm - El manejador de persistencia
	 * @return Un arreglo con 7 n�meros que indican el n�mero de tuplas borradas en las tablas 
	 */
	public long [] limpiarCadenaHoteles (PersistenceManager pm)
	{
		Query qTipoIdentificacion = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaTipoIdentificacion());
		Query qTipoPlanDeConsumo=pm.newQuery(SQL,"DELETE FROM "+pp.darTablaTipoPlanDeConsumo());
		Query qTipoReservaHabitacion=pm.newQuery(SQL,"DELETE FROM "+pp.darTablaTipoReservaHabitacion());
		Query qTipoRol = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaTipoRol());
		Query qClientes = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaClientes());
		Query qEmpleados = pm.newQuery(SQL, "DELETE FROM "+pp.darTablaEmpleados());
		Query qGastos = pm.newQuery(SQL,"DELETE FROM"+pp.darTablaGastos());
		Query qHabitaciones = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaHabitaciones());
		Query qHoteles = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaHoteles());
		Query qPlanesDeConsumo = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaPlanesDeConsumo());
		Query qProductos = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaProductos());
		Query qReservasHabitaciones = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaReservasHabitaciones());
		Query qReservasServicios = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaReservasServicios());
		Query qServicios = pm.newQuery(SQL,"DELETE FROM "+pp.darTablaServicios());
		long clientesEliminados = (long) qClientes.executeUnique();
		long empleadosEliminados = (long) qEmpleados.executeUnique();
		long gastosEliminados = (long) qGastos.executeUnique();
		long habitacionesEliminados = (long) qHabitaciones.executeUnique();
		long hotelesEliminados = (long) qHoteles.executeUnique();
		long planesDeConsumoEliminados = (long)  qPlanesDeConsumo.executeUnique();
		long productosEliminados = (long) qProductos.executeUnique();
		long reservasHabitacionesEliminados = (long) qReservasHabitaciones.executeUnique();
		long reservasServiciosEliminados = (long) qReservasServicios.executeUnique();
		long serviciosEliminados = (long) qServicios.executeUnique();
		long tipoIdentificacionEliminados = (long) qTipoIdentificacion.executeUnique();
		long tipoPlanDeConsumoEliminados = (long) qTipoPlanDeConsumo.executeUnique();
		long tipoReservaHabitacionEliminados = (long) qTipoReservaHabitacion.executeUnique();
		long tipoRolEliminados = (long) qTipoRol.executeUnique();
		
		return new long[]{clientesEliminados,empleadosEliminados,gastosEliminados,habitacionesEliminados,hotelesEliminados,
		                planesDeConsumoEliminados, productosEliminados, reservasHabitacionesEliminados, reservasServiciosEliminados,
		                serviciosEliminados,tipoIdentificacionEliminados,tipoPlanDeConsumoEliminados,tipoReservaHabitacionEliminados,
		                tipoRolEliminados};
	}
	
}
