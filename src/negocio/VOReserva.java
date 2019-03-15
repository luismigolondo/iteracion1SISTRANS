package negocio;

import java.util.Date;

import negocio.Reserva.TIPOS_DE_RESERVA;

public interface VOReserva {

	/**
	 * Interfaz para los metodos get de RESERVA
	 * @return el id
	 */
	public Long getId();
	
	/**
	 * 
	 * @return el tipo
	 */
	public TIPOS_DE_RESERVA getTipo();
	
	/**
	 * 
	 * @return el inicio
	 */
	public Date getFechaInicio();
	
	/**
	 * 
	 * @return la fecha final
	 */
	public Date getFechaFin();
	
	/**
	 * 
	 * @return  el checkIn
	 */
	public Boolean getCheckedIn();
	
	/**
	 * 
	 * @return el checkOut
	 */
	public Boolean getCheckedOut();
}
