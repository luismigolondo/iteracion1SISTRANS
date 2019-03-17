package persistencia;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.google.gson.JsonObject;

import negocio.ReservaHabitacion;

public class PersistenciaHoteles {


	///--------------------------------------
	///---CONSTANTES
	///--------------------------------------
	
	/**
	 * Logger para escribir la traza de la ejecuci�n
	 */
	private static Logger log = Logger.getLogger(PersistenciaHoteles.class.getName());

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	///--------------------------------------
	///---ATRIBUTOS
	///--------------------------------------
	
	private static PersistenciaHoteles instance;
	
	private PersistenceManagerFactory pmf;
	
	private List<String> tablas;
	
	//private SQLUtil sqlUtil;
	
	private SQLClientes sqlClientes;
	
	private SQLEmpleados sqlEmpleados;
	
	private SQLGastos sqlGastos;
	
	private SQLHabitaciones sqlHabitaciones;
	
	private SQLHoteles sqlHoteles;
	
	private SQLPlanes_De_Consumo sqlPlanes_De_Consumo;
	
	private SQLProductos sqlProductos;
	
	private SQLReservas_Habitaciones sqlReservas_Habitaciones;

	private SQLReservas_Servicios sqlReservas_Servicios;
	
	private SQLServicios sqlServicios;

	private SQLTipo_Identificacion sqlTipo_Identificacion;

	private SQLTipo_Plan_De_Consumo sqlTipo_Plan_De_Consumo;

	private SQLTipo_Reserva__Habitacion sqlTipo_Reserva_Habitacion;
	
	private SQLTipo_Rol sqlTipo_Rol;
	
	private PersistenciaHoteles(){
		pmf = JDOHelper.getPersistenceManagerFactory("Hoteles");
		crearClasesSQL();
	}
	
	private PersistenciaHoteles(JsonObject configTabla)
	{
		crearClasesSQL();
		tablas = leerNombresTablas(configTabla);
		
		String unidadPersistencia = configTabla.get("unidadPersistencia").getAsString();
		log.trace ("Se esta accediendo a la persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory(unidadPersistencia);		
	}
	
	private List<String> leerNombresTablas(JsonObject configTabla) {
		// TODO Auto-generated method stub
		return null;
	}

	private void crearClasesSQL ()
	{
		sqlClientes = new SQLClientes(this);
		sqlEmpleados = new SQLEmpleados(this);
		sqlGastos = new SQLGastos(this);
		sqlHabitaciones = new SQLHabitaciones(this);
		sqlHoteles = new SQLHoteles(this);
		sqlPlanes_De_Consumo = new SQLPlanes_De_Consumo(this);
		sqlProductos = new SQLProductos(this);
		sqlReservas_Habitaciones = new SQLReservas_Habitaciones(this);
		sqlReservas_Servicios = new SQLReservas_Servicios(this);
		sqlServicios = new SQLServicios(this);
		sqlTipo_Identificacion = new SQLTipo_Identificacion(this);
		sqlTipo_Plan_De_Consumo = new SQLTipo_Plan_De_Consumo(this);
		sqlTipo_Reserva_Habitacion = new SQLTipo_Reserva__Habitacion(this);
		sqlTipo_Rol = new SQLTipo_Rol(this);
		
		tablas = new LinkedList<String>();
		tablas.add("CadenaHoteles_sequence");
		tablas.add("BARES");
		tablas.add("CLIENTES");
		tablas.add("EMPLEADOS");
		tablas.add("GASTO");
		tablas.add("HABITACIONES");
		tablas.add("HOTELES");
		tablas.add("PLANES_DE_CONSUMO");
		tablas.add("PRODUCTOS");
		tablas.add("RESERVAS_HABITACIONES");
		tablas.add("SERVICIOS");
		tablas.add("TIPO_IDENTIFICACION");
		tablas.add("TIPO_PLAN_DE_CONSUMO");
		tablas.add("TIPO_RESERVA_HABITACION");
		tablas.add("TIPO_ROL");
	}

	public static PersistenciaHoteles getInstance() {
		if(instance == null)
			instance = new PersistenciaHoteles();
		return instance;
	}
	
	public static PersistenciaHoteles getInstance(JsonObject configuracionTabla) {
		if(instance == null)
			instance = new PersistenciaHoteles(configuracionTabla);
		return instance;
	}


	public void cerrarPersistencia() {
		pmf.close();
		instance = null;
	}

// DD/MM/YYYY
	public ReservaHabitacion adicionarReserva(long pId, long pIdCliente, long pIdTipoId, long pIdHabitacion,
			long pIdPlanDeConsumo, String pFechaInicio, String pFechaFin) {
	PersistenceManager pm = pmf.getPersistenceManager();
	Transaction tx = pm.currentTransaction();
//	try
//	{
//		
//	}

		return null;
	}


	public ReservaHabitacion registrarLlegada(Long pIdReserva, Long pIdCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ReservaHabitacion checkout(Long pIdReserva, Long pIdCliente){
		return null;
	}

	
}
