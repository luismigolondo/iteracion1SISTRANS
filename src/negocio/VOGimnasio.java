package negocio;

import java.util.Date;

/**
 * Interfaz para los metodos get de GIMNASIO
 * @author jd.diazc
 *
 */
public interface VOGimnasio {
	
	/**
	 * 
	 * @return el nombre del gimnasio
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return la capacidad del gimnasio
	 */
	public Integer getCapacidad();
	
	/**
	 * 
	 * @return la hora de apertura del gimnasio
	 */
	public Date horaApertura();
	
	/**
	 * 
	 * @return la hora de cierre del gimnasio
	 */
	public Date horaCierre();
	
	/**
	 * 
	 * @return el costo de uso del gimnasio
	 */
	public Double getCosto();
	
	/**
	 * 
	 * @return la descripcion del gimnasio
	 */
	public String getDescripcion();
	
}
