package negocio;

/**
 * Interfaz para los metodos get de PRODUCTO
 * @author jd.diazc
 *
 */
public interface VOProducto {

	/**
	 * 
	 * @return el id
	 */
	public Integer getId();
	
	/**
	 * 
	 * @return el nombre
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return el valor
	 */
	public Double getValor();
	
	/**
	 * 
	 * @return el id de servicio al que pertenece el producto
	 */
	public Integer getIdServicio();
}
