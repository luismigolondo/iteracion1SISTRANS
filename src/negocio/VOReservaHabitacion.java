package negocio;

import java.util.Date;

import negocio.ReservaHabitacion.TIPOS_DE_RESERVA;

public interface VOReservaHabitacion {

	/**
	 * Interfaz para los metodos get de RESERVA
	 * @return el id
	 */
	public Long getId();

	
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
	public boolean isCheckedIn();
	
	/**
	 * 
	 * @return el checkOut
	 */
	public boolean isCheckedOut();
}
