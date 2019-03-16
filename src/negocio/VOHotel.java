package negocio;

/**
 * Interfaz para los metodos get de HOTEL
 * @author jd.diazc
 *
 */
public interface VOHotel {

	/**
	 * 
	 * @return el id del hotel
	 */
	public Long getId();
	
	/**
	 * 
	 * @return el nombre del hotel
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return las estrellas de un hotel
	 */
	public Integer getEstrellas();
}
