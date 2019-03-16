/**
 * 
 */
package negocio;

import java.util.Date;

/**
 * @author luisgomez
 *
 */
public class ReservaHabitacion implements VOReservaHabitacion{

	public enum TIPOS_DE_RESERVA {
		HABITACION_SUITE,
		HABITACION_SUITE_PRESIDENCIAL,
		HABITACION_SENCILLA
	}
	
	private Long id;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private boolean checkedIn;
	
	private boolean checkedOut;
	
	public ReservaHabitacion () {
		this.id = null;
		this.fechaInicio = null;
		this.fechaFin = null;
		this.checkedIn = false;
		this.checkedOut = false;
	}
	
	/**
	 * @param id
	 * @param tipo
	 * @param fechaInicio
	 * @param fechaFin
	 * @param checkedIn
	 * @param checkedOut
	 */
	public ReservaHabitacion(Long id, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.checkedIn = false;
		this.checkedOut = false;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the checkedIn
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * @param checkedIn the checkedIn to set
	 */
	public void setCheckIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	/**
	 * @return the checkedOut
	 */
	public boolean isCheckedOut() {
		return checkedOut;
	}

	/**
	 * @param checkedOut the checkedOut to set
	 */
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}	
	
}
