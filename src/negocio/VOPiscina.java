package negocio;

import java.util.Date;

/**
 * Interfaz para los metodos get de PISCINA
 * @author jd.diazc
 *
 */
public interface VOPiscina {

	/**
	 * 
	 * @return la capaciadad de la piscina
	 */
	public Integer getCapacidad();
	
	/**
	 * 
	 * @return la profundidad
	 */
	public Double getProfundidad();
	
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
