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
	public Reserva adicionarReserva(Long pId, Long pIdHotel, Long pIdCliente, int pTipoID, Long pPlanDeConsumo, int pTipoReserva, Date pFechaInicio, Date pFechaFin)
	{
		log.info("Creando reserva: " + pId + ", Para el cliente: " + pIdCliente);
		Reserva reserva = persistencia.adicionarReserva(pId, pIdHotel, pIdCliente, pTipoID, pPlanDeConsumo, pTipoReserva, pFechaInicio, pFechaFin);
		log.info("Reserva creada: " + reserva);
		return reserva;
	}
	//RF9
	public Reserva registrarLlegadaCliente(Long pIdReserva, Long pIdCliente)
	{
		log.info("Registrando cliente: " + pIdCliente + " de la reserva: " + pIdReserva);
		Reserva registrar = persistencia.registrarLlegada(pIdReserva, pIdCliente);
		log.info("La reserva: " + registrar + " fue activada.");
		return registrar;
	}
	public long[] limpiarHoteles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
