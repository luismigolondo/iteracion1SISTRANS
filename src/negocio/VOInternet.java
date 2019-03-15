package negocio;

/**
 * Interfaz para los metodos get de INTERNET
 * @author jd.diazc
 *
 */
public interface VOInternet {

	/**
	 * 
	 * @return la capacidad del internet
	 */
	public Double getCapacidad();
	
	/**
	 * 
	 * @return el costo del internet
	 */
	public Double getCosto();
	
	/**
	 * 
	 * @return la descripcion del internet
	 */
	public String getDescripcion();
}
