/**
 * 
 */
package negocio;

import java.sql.Date;
import java.util.logging.Logger;

import com.google.gson.JsonObject;

import persistencia.PersistenciaCadenaHoteles;

/**
 * Clase principal de la cadena de hoteles.
 * @author Germ�n Bravo
 * MODIFICADO POR LUIS MIGUEL GOMEZ Y JUAN DAVID DIAZ PARA LA ITERACION 1 DE SISTEMAS TRANSACCIONALES.
 */
public class CadenaHoteles {
	private static Logger log = Logger.getLogger(Hotel.class.getName());

	private PersistenciaCadenaHoteles persistencia;

	public CadenaHoteles() {
		persistencia = PersistenciaCadenaHoteles.getInstance();
	}
	public CadenaHoteles(JsonObject configuracionTabla)
	{
		persistencia = PersistenciaCadenaHoteles.getInstance(configuracionTabla);
	}

	public void cerrarPersistencia() {
		persistencia.cerrarPersistencia();
	}

	//RF7
	public ReservaHabitacion adicionarReservaHabitacion(long pId, long pIdCliente, long pIdTipoId, long pIdHabitacion,
			long pIdPlanDeConsumo, String pFechaInicio, String pFechaFin)
	{
		log.info("Creando reserva habitacion: " + pId + ", Para el cliente: " + pIdCliente);
		ReservaHabitacion reserva = persistencia.RF7adicionarReservaHabitacion(pId, pIdCliente, pIdTipoId, pIdHabitacion, pIdPlanDeConsumo, pFechaInicio, pFechaFin);
		log.info("Reserva creada: " + reserva);
		return reserva;
	}

	//RF8
	public ReservaServicio adicionarReservaServicio(long id, String horaInicio, String horaFin, long pIdCliente, 
			long pIdTipoId, long servicio)
	{
		log.info("Creando reserva servicio: " + id + ", Para el cliente: " + pIdCliente);
		ReservaServicio reserva = persistencia.RF8adicionarReservaServicio(id, horaInicio, horaFin, pIdCliente, pIdTipoId, servicio);
		persistencia.cambiarReservaServicioCliente(pIdCliente, servicio);
		log.info("Reserva creada: " + reserva);
		return reserva;
	}
	//RF9
	public long registrarLlegadaCliente(Long pIdReserva)
	{
		log.info("Registrando cliente:  de la reserva: " + pIdReserva);
		long registrar = persistencia.RF9registrarLlegadaCliente(pIdReserva);
		log.info("La reserva: " + registrar + " fue activada.");
		return registrar;
	}
	
	//RF10
	public Gasto registrarConsumoServicio(long idHabitacion, long idProducto)
	{
		log.info("Registrando consumo cliente de la habitacion : "+ idHabitacion +"el producto " + idProducto );
		Gasto gasto = persistencia.RF10registrarConsumoServicio(idHabitacion, idProducto);
		log.info("Se agrego el producto " + idProducto + " a la cuenta de la habitación "+idHabitacion);
		return gasto;
	}
	
	//RF11
	public long registrarSalidaCliente(long pIdReserva)
	{
		log.info("Realizando checkout de la reserva: " + pIdReserva);
		long checkout = persistencia.RF11registrarSalidaCliente(pIdReserva);
		log.info("Se realiz� el checkout de la habitaci�n "+checkout);
		return checkout;
	}
	
	/**
	 * Encuentra un cliente según su identificador
	 * @param idCliente - El identificador del cliente buscado
	 * @return Un objeto del cliente que se busca por id y tipo
	 */
	public Cliente darClientePorId (long idCliente)
	{
        log.info ("Dar información de un cliente por id: " + idCliente);
        Cliente cliente = persistencia.darCLientePorId(idCliente);
        log.info ("Buscando cliente por Id: " + idCliente != null ? idCliente  + "": "NO EXISTE");
        return cliente;
	}
	
	public long[] limpiarHoteles() {
		log.info ("Limpiando la BD de Cadena de Hoteles");
        long [] borrrados = persistencia.limpiarParranderos();	
        log.info ("Limpiando la BD de Hoteles: Listo!");
        return borrrados;
	}
	public VOCliente adicionarCliente(long idHotel, long idCliente, long tipoId, long idHabitacion, long idServicio, String nombreUsuario,
			String correoUsuario) {
		log.info ("Adicionando cliente: " + nombreUsuario);
        Cliente bebedor = persistencia.adicionarCliente(idHotel, idCliente, tipoId, idHabitacion, idServicio, nombreUsuario, correoUsuario);
        log.info ("Adicionando cliente: " + nombreUsuario);
        return bebedor;
	}


}
