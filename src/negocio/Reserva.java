/**
 * 
 */
package negocio;

import java.util.Date;

/**
 * @author luisgomez
 *
 */
public class Reserva implements VOReserva{

	public enum TIPOS_DE_RESERVA {
		SPA,
		SALON_CONFERENCIA,
		SALON_REUNION,
		HABITACION_SUITE,
		HABITACION_SUITE_PRESIDENCIAL,
		HABITACION_SENCILLA
	}
	
	private Long id;
	
	private TIPOS_DE_RESERVA tipo;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private boolean checkedIn;
	
	private boolean checkedOut;
	
	public Reserva () {
		this.id = null;
		this.tipo = null;
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
	public Reserva(Long id, TIPOS_DE_RESERVA tipo, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.tipo = tipo;
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
	 * @return the tipo
	 */
	public TIPOS_DE_RESERVA getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TIPOS_DE_RESERVA tipo) {
		this.tipo = tipo;
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
