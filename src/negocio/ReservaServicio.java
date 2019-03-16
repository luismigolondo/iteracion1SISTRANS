package negocio;

import java.sql.Date;

public class ReservaServicio implements VOReservaServicio {

	/**
	 *  id del servicio
	 */
	private Long id;
	
	/**
	 * hora de inicio del servicio
	 */
	private Date horaInicio;
	
	/**
	 * hora de finalizacion del servicio
	 */
	private Date horaFin;

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
	 * @return the horaInicio
	 */
	public Date getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFin
	 */
	public Date getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}
	
	
}
