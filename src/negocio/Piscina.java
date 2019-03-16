/**
 * 
 */
package negocio;

import java.util.Date;

/**
 * @author luisgomez
 *
 */
public class Piscina implements VOPiscina{

	private Integer capacidad;
	
	private Double profundidad;
	
	private Date horaApertura;
	
	private Date horaCierre;
	
	private Double costo;
	
	public Piscina () {
		this.capacidad = 0;
		this.profundidad = 0.0;
		this.horaApertura = null;
		this.horaCierre = null;
		this.costo = 0.0;
	}

	/**
	 * @param capacidad
	 * @param profundidad
	 * @param horaApertura
	 * @param horaCierre
	 * @param costo
	 */
	public Piscina(Integer capacidad, Double profundidad, Date horaApertura, Date horaCierre, Double costo) {
		this.capacidad = capacidad;
		this.profundidad = profundidad;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.costo = costo;
	}

	/**
	 * @return the capacidad
	 */
	public Integer getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the profundidad
	 */
	public Double getProfundidad() {
		return profundidad;
	}

	/**
	 * @param profundidad the profundidad to set
	 */
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	/**
	 * @return the horaApertura
	 */
	public Date getHoraApertura() {
		return horaApertura;
	}

	/**
	 * @param horaApertura the horaApertura to set
	 */
	public void setHoraApertura(Date horaApertura) {
		this.horaApertura = horaApertura;
	}

	/**
	 * @return the horaCierre
	 */
	public Date getHoraCierre() {
		return horaCierre;
	}

	/**
	 * @param horaCierre the horaCierre to set
	 */
	public void setHoraCierre(Date horaCierre) {
		this.horaCierre = horaCierre;
	}

	/**
	 * @return the costo
	 */
	public Double getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	
}
