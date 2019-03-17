/**
 * 
 */
package negocio;

import java.sql.Date;
import java.util.logging.Logger;

import com.google.gson.JsonObject;

import persistencia.PersistenciaCadenaHoteles;

/**
 * @author lm.gomezl
 *
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
		log.info("Reserva creada: " + reserva);
		return reserva;
	}
	//RF9
	public ReservaHabitacion registrarLlegadaCliente(Long pIdReserva, Long pIdCliente)
	{
		log.info("Registrando cliente: " + pIdCliente + " de la reserva: " + pIdReserva);
		ReservaHabitacion registrar = persistencia.RF9registrarLlegadaCliente(pIdReserva, pIdCliente);
		log.info("La reserva: " + registrar + " fue activada.");
		return registrar;
	}

	public ReservaHabitacion registrarSalidaCliente(Long pIdReserva, Long pIdCliente)
	{
		log.info("Realizando checkout: " + pIdCliente + " de la reserva: " + pIdReserva);
		ReservaHabitacion checkout = persistencia.checkout(pIdReserva, pIdCliente);
		log.info("Se realiz� el checkout de la habitaci�n "+checkout);
		return checkout;
	}
	public long[] limpiarHoteles() {
		// TODO Auto-generated method stub
		return null;
	}


}
