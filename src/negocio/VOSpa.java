package negocio;

import java.util.Date;

public interface VOSpa {

	/**
	 * 
	 * @return el nombre
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return los servicios
	 */
	public String getServicios();
	
	/**
	 * 
	 * @return la hora de apertura
	 */
	public Date getHoraApertura();
	
	/**
	 * 
	 * @return la hora de cierre
	 */
	public Date getHoraCierre();
	
	/**
	 * 
	 * @return el costo
	 */
	public Double getCosto();
}
