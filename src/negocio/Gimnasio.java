/**
 * 
 */
package negocio;

import java.util.Date;

/**
 * @author luisgomez
 *
 */
public class Gimnasio implements VOGimnasio {

	private String nombre;
	
	private Integer capacidad;
	
	private Date horaApertura;
	
	private Date horaCierre;
	
	private Double costo;
	
	private String descripcion;
	
	public Gimnasio () {
		this.nombre = "";
		this.capacidad = 0;
		this.horaApertura = null;
		this.horaCierre = null;
		this.costo = 0.0;
		this.descripcion = "";
	}

	/**
	 * @param nombre
	 * @param capacidad
	 * @param horaApertura
	 * @param horaCierre
	 * @param costo
	 * @param descripcion
	 */
	public Gimnasio(String nombre, Integer capacidad, Date horaApertura, Date horaCierre, Double costo,
			String descripcion) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.costo = costo;
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
