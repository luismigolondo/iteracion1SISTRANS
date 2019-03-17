package persistencia;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

import javax.jdo.JDODataStoreException;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import negocio.Gasto;
import negocio.ReservaHabitacion;
import negocio.ReservaServicio;

public class PersistenciaCadenaHoteles {


	///--------------------------------------
	///---CONSTANTES
	///--------------------------------------

	/**
	 * Logger para escribir la traza de la ejecuci�n
	 */
	private static Logger log = Logger.getLogger(PersistenciaCadenaHoteles.class.getName());

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	///--------------------------------------
	///---ATRIBUTOS
	///--------------------------------------

	private static PersistenciaCadenaHoteles instance;

	private PersistenceManagerFactory pmf;

	private List<String> tablas;

	private SQLUtil sqlUtil;

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

	private PersistenciaCadenaHoteles(){
		pmf = JDOHelper.getPersistenceManagerFactory("Hoteles");
		crearClasesSQL();

		tablas = new LinkedList<String>();
		tablas.add("CadenaHoteles_sequence");
		tablas.add("CLIENTES");
		tablas.add("EMPLEADOS");
		tablas.add("GASTOS");
		tablas.add("HABITACIONES");
		tablas.add("HOTELES");
		tablas.add("PLANES_DE_CONSUMO");
		tablas.add("PRODUCTOS");
		tablas.add("RESERVAS_HABITACIONES");
		tablas.add("RESERVAS_SERVICIOS");
		tablas.add("SERVICIOS");
		tablas.add("TIPO_IDENTIFICACION");
		tablas.add("TIPO_PLAN_DE_CONSUMO");
		tablas.add("TIPO_RESERVA_HABITACION");
		tablas.add("TIPO_ROL");
	}

	private PersistenciaCadenaHoteles(JsonObject configTabla)
	{
		crearClasesSQL();
		tablas = leerNombresTablas(configTabla);

		String unidadPersistencia = configTabla.get("unidadPersistencia").getAsString();
		log.trace ("Se esta accediendo a la persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory(unidadPersistencia);		
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

	}

	public static PersistenciaCadenaHoteles getInstance() {
		if(instance == null)
			instance = new PersistenciaCadenaHoteles();
		return instance;
	}

	public static PersistenciaCadenaHoteles getInstance(JsonObject configuracionTabla) {
		if(instance == null)
			instance = new PersistenciaCadenaHoteles(configuracionTabla);
		return instance;
	}

	public void cerrarPersistencia() {
		pmf.close();
		instance = null;
	}

	/**
	 * Genera una lista con los nombres de las tablas de la base de datos
	 * @param tableConfig - El objeto Json con los nombres de las tablas
	 * @return La lista con los nombres del secuenciador y de las tablas
	 */
	private List<String> leerNombresTablas(JsonObject configTabla) {
		JsonArray nombres = configTabla.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		return resp;
	}

	/**
	 * @return La cadena de caracteres con el nombre del secuenciador de parranderos
	 */
	public String darSeqCadenaHoteles ()
	{
		return tablas.get (0);
	}

	public String darTablaClientes()
	{
		return tablas.get(1);
	}

	public String darTablaEmpleados()
	{
		return tablas.get(2);
	}

	public String darTablaGastos()
	{
		return tablas.get(3);
	}

	public String darTablaHabitaciones()
	{
		return tablas.get(4);
	}

	public String darTablaHoteles()
	{
		return  tablas.get(5);
	}

	public String darTablaPlanesDeConsumo()
	{
		return tablas.get(6);
	}

	public String darTablaProductos()
	{
		return tablas.get(7);
	}

	public String darTablaReservasHabitaciones()
	{
		return tablas.get(8);
	}

	public String darTablaReservasServicios()
	{
		return tablas.get(9);
	}

	public String darTablaServicios()
	{
		return tablas.get(10);
	}

	public String darTablaTipoIdentificacion(){
		return tablas.get(11);
	}

	public String darTablaTipoPlanDeConsumo()
	{
		return tablas.get(12);
	}

	public String darTablaTipoReservaHabitacion()
	{
		return tablas.get(13);
	}

	public String darTablaTipoRol()
	{
		return tablas.get(14);
	}

	/**
	 * Transacci�n para el generador de secuencia de Parranderos
	 * Adiciona entradas al log de la aplicaci�n
	 * @return El siguiente n�mero del secuenciador de Parranderos
	 */
	private long nextval ()
	{
		long resp = sqlUtil.nextval (pmf.getPersistenceManager());
		log.trace ("Generando secuencia: " + resp);
		return resp;
	}

	/**
	 * Extrae el mensaje de la exception JDODataStoreException embebido en la Exception e, que da el detalle espec�fico del problema encontrado
	 * @param e - La excepci�n que ocurrio
	 * @return El mensaje de la excepci�n JDO
	 */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}
	
	/**
	 * FR7 REGISTRAR UNA RESERVA DE ALOJAMIENTO
	 *Reserva una habitación por un período de tiempo, por parte de un cliente, siempre y cuando esté disponible.
	 * Esta operación es realizada por un cliente.
	 * @param pId id de la reserva
	 * @param pIdCliente id del cliente de la reserva
	 * @param pIdTipoId tipo de cedula del cliente
	 * @param pIdHabitacion la habitacion asignada a la reserva
	 * @param pIdPlanDeConsumo el tipo de plan de reserva que se asigna
	 * @param pFechaInicio la fecha en la que inicia la reserva.
	 * @param pFechaFin la fecha en la que termina una reserva.
	 * @return
	 */
	public ReservaHabitacion RF7adicionarReservaHabitacion(long pId, long pIdCliente, long pIdTipoId, long pIdHabitacion,
			long pIdPlanDeConsumo, String pFechaInicio, String pFechaFin) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try
		{
			tx.begin();

			long tupla = sqlReservas_Habitaciones.adicionarReserva(pm, pId, pIdCliente, pIdTipoId, pIdHabitacion, pIdPlanDeConsumo, pFechaInicio, pFechaFin);
			tx.commit();

			log.trace("Insercion reserva: " + pId + ": " + tupla + " tuplas insertadas" );
			long [] idCliente = new long [] {pIdCliente, pIdTipoId};
			return new ReservaHabitacion(pId, idCliente, pIdHabitacion, pIdPlanDeConsumo, pFechaInicio, pFechaFin);
		}
		catch (Exception e)
		{
			log.error("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
			return null;
		}
		finally
		{
			if(tx.isActive())
			{
				tx.rollback();
			}
			pm.close();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public ReservaServicio RF8adicionarReservaServicio()
	{
		return null;
	}

	public ReservaHabitacion RF9registrarLlegadaCliente(Long pIdReserva, Long pIdCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//servicio, nosotros manejamos lo que ofrecen los servicios como productos.
	public Gasto RF10registrarConsumoServicio()
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try{
        	tx.begin();
        	long tupla = sqlGastos.registrarConsumoServicio(pm,idHabitacion,idProducto);
        	return new Gasto(idHabitacion, idProducto);
        }
        catch(Exception e)
        {
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return null;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
		
	}
	
	public long RF11registrarSalidaCliente(long idReserva)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			long resp = sqlReservas_Habitaciones.registrarSalidaCliente(pm,idReserva);
			tx.commit();
			return resp;
		}
		catch(Exception e)
		{
			log.error("Exception : "+e.getMessage()+ "\n" + darDetalleException(e));
			return -1;
		}
		finally{
			if(tx.isActive())
				tx.rollback();
			pm.close();
		}
	
	}


}
