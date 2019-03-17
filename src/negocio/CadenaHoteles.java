/**
 * 
 */
package negocio;

import java.sql.Date;
import java.util.logging.Logger;

import com.google.gson.JsonObject;

import persistencia.PersistenciaHoteles;

/**
 * @author lm.gomezl
 *
 */
public class CadenaHoteles {
	private static Logger log = Logger.getLogger(Hotel.class.getName());

	private PersistenciaHoteles persistencia;
	
	public CadenaHoteles() {
		persistencia = PersistenciaHoteles.getInstance();
	}
	public CadenaHoteles(JsonObject configuracionTabla)
	{
		persistencia = PersistenciaHoteles.getInstance(configuracionTabla);
	}
	
	public void cerrarPersistencia() {
		persistencia.cerrarPersistencia();
	}
	
	//RF7 y RF8 depende del tipo de reserva
	public ReservaHabitacion adicionarReserva(long pId, long pIdCliente, long pIdTipoId, long pIdHabitacion,
			long pIdPlanDeConsumo, String pFechaInicio, String pFechaFin)
	{
		log.info("Creando reserva: " + pId + ", Para el cliente: " + pIdCliente);
		ReservaHabitacion reserva = persistencia.adicionarReserva(pId, pIdCliente, pIdTipoId, pIdHabitacion, pIdPlanDeConsumo, pFechaInicio, pFechaFin);
		log.info("Reserva creada: " + reserva);
		return reserva;
	}
	//RF9
	public ReservaHabitacion registrarLlegadaCliente(Long pIdReserva, Long pIdCliente)
	{
		log.info("Registrando cliente: " + pIdCliente + " de la reserva: " + pIdReserva);
		ReservaHabitacion registrar = persistencia.registrarLlegada(pIdReserva, pIdCliente);
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
