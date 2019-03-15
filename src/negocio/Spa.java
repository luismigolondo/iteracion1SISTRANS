/**
 * 
 */
package negocio;

import java.util.Date;

/**
 * @author luisgomez
 *
 */
public class Spa {

	private String nombre;
	
	//TODO REVISAR
	private String servicios;
		
	private Date horaApertura;
	
	private Date horaCierre;
	
	private Double costo;
	
	public Spa () {
		this.nombre = "";
		this.servicios = "";
		this.horaApertura = null;
		this.horaCierre = null;
		this.costo = 0.0;
	}

	/**
	 * @param nombre
	 * @param servicios
	 * @param horaApertura
	 * @param horaCierre
	 * @param costo
	 */
	public Spa(String nombre, String servicios, Date horaApertura, Date horaCierre, Double costo) {
		this.nombre = nombre;
		this.servicios = servicios;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.costo = costo;
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
	 * @return the servicios
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * @param servicios the servicios to set
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
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
