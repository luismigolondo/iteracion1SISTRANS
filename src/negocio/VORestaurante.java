package negocio;

import negocio.Restaurante.ESTILOS_RESTAURANTES;

/**
  * Interfaz para los metodos get de RESTAURANTE
 * @author jd.diazc
 *
 */
public interface VORestaurante {
	
	/**
	 * 
	 * @return el nombre
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return la capacidad
	 */
	public Long getCapacidad();
	
	/**
	 * 
	 * @return el estilo
	 */
	public ESTILOS_RESTAURANTES getEstilo();
	
	/**
	 * 
	 * @return la descripcion
	 */
	public String getDescripcion();
	
}
