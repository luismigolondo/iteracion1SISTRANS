package negocio;

/**
 * Interfaz para los metodos get de Habitacion
 * @author jd.diazc
 *
 */
public interface VOHabitacion {

	/**
	 * 
	 * @return el numero de la habitacion
	 */
	public Integer getNumeroHabitacion();
	
	/**
	 * 
	 * @return la capacidad de la habitacion
	 */
	public Integer getCapacidad();
	
	/**
	 * 
	 * @return la dotacion de la habitacion
	 */
	public String getDotacion();
}
