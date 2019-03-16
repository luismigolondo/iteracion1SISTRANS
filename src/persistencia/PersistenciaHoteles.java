package persistencia;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PersistenciaHoteles {


	///--------------------------------------
	///---CONSTANTES
	///--------------------------------------
	
	/**
	 * Logger para escribir la traza de la ejecución
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
	
	private SQLBares sqlBares;
	
	private SQLClientes sqlClientes;
	
	private SQLEmpleados sqlEmpleados;
	
	private SQLGasto sqlGasto;
	
	private SQLGimnasios sqlGimnasios;
	
	private SQLHabitaciones sqlHabitaciones;
	
	private SQLHoteles sqlHoteles;
	
	private SQLInternet_Hoteles sqlInternet_Hoteles;
	
	private SQLLavanderias sqlLavanderias;
	
	private SQLPiscinas sqlPiscinas;
	
	private SQLPlanes_De_Consumo sqlPlanes_De_Consumo;
	
	private SQLPrestamos sqlPrestamos;
	
	private SQLProductos sqlProductos;
	
	private SQLReservas sqlReservas;
	
	private SQLServicios_Hoteles sqlServicios_Hoteles;
	
	private SQLSpas sqlSpas;
	
	private SQLSupermercados sqlSupermercados;
	
	private SQLTiendas sqlTiendas;
	
	private SQLTipo_Estilo sqlTipo_Estilos;
	
	private SQLTipo_Identificacion sqlTipo_Identificacion;
	
	private SQLTipo_Lavado sqlTipo_Lavado;
	
	private SQLTipo_Plan_De_Consumo sqlTipo_Plan_De_Consumo;
	
	private SQLTipo_Reserva sqlTipo_Reserva;
	
	private SQLTipo_Restaurante sqlTipo_Restaurantes;
	
	private SQLTipo_Salon sqlTipo_Salon;
	
	private SQLTipo_Utensilio sqlTipo_Utensilio;
	
	
	
	private PersistenciaHoteles(){
		pmf = JDOHelper.getPersistenceManagerFactory("Hoteles");
		crearClasesSQL();
	}
	
	
	private void crearClasesSQL ()
	{
		sqlBares = new SQLBares(this);
		sqlClientes = new SQLClientes(this);
		sqlEmpleados = new SQLEmpleados(this);
		sqlGasto = new SQLGasto(this);
		sqlGimnasios = new SQLGimnasios(this);
		sqlHabitaciones = new SQLHabitaciones(this);
		sqlHoteles = new SQLHoteles(this);
		sqlInternet_Hoteles = new SQLInternet_Hoteles(this);
		sqlLavanderias = new SQLLavanderias(this);
		sqlPiscinas = new SQLPiscinas(this);
		sqlPlanes_De_Consumo = new SQLPlanes_De_Consumo(this);
		sqlPrestamos = new SQLPrestamos(this);
		sqlProductos = new SQLProductos(this);
		sqlReservas = new SQLReservas(this);
		sqlServicios_Hoteles = new SQLServicios_Hoteles(this);
		sqlSpas = new SQLSpas(this);
		sqlSupermercados = new SQLSupermercados(this);
		sqlTiendas = new SQLTiendas(this);
		sqlTipo_Estilos = new SQLTipo_Estilo(this);
		sqlTipo_Identificacion = new SQLTipo_Identificacion(this);
		sqlTipo_Lavado = new SQLTipo_Lavado(this);
		sqlTipo_Plan_De_Consumo = new SQLTipo_Plan_De_Consumo(this);
		sqlTipo_Reserva = new SQLTipo_Reserva(this);
		sqlTipo_Restaurantes = new SQLTipo_Restaurante(this);
		sqlTipo_Salon = new SQLTipo_Salon(this);
		sqlTipo_Utensilio = new SQLTipo_Utensilio(this);
		
		tablas = new LinkedList<String>();
		tablas.add("Hoteles_sequence");
		tablas.add("BARES");
		tablas.add("CLIENTES");
		tablas.add("EMPLEADOS");
		tablas.add("GASTO");
		tablas.add("GIMNASIOS");
		tablas.add("HABITACIONES");
		tablas.add("HOTELES");
		tablas.add("INTERNET_HOTELES");
		tablas.add("LAVANDERIAS");
		tablas.add("PISCINAS");
		tablas.add("PLANES_DE_CONSUMO");
		tablas.add("PRESTAMOS");
		tablas.add("PRODUCTOS");
		tablas.add("RESERVAS");
		tablas.add("SERVICIOS_HOTELES");
		tablas.add("SPAS");
		tablas.add("SUPERMERCADOS");
		tablas.add("TIENDAS");
		tablas.add("TIPO_ESTILO");
		tablas.add("TIPO_IDENTIFICACION");
		tablas.add("TIPO_LAVADO");
		tablas.add("TIPO_PLAN_DE_CONSUMO");
		tablas.add("TIPO_RESERVA");
		tablas.add("TIPO_RESTAURANTE");
		tablas.add("TIPO_SALON");
		tablas.add("TIPO_UTENSILIO");
	}
	
}
