package negocio;

import negocio.Bar.ESTILOS_BARES;

/**
 * Interfaz para los metodos get de BAR
 * @author jd.diazc
 *
 */
public interface VOBar {

	///-----------------------------
	///METODOS
	///-----------------------------
	
	/**
	 * 
	 * @return el nombre del bar
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return la capacidad del bar
	 */
	public Integer getCapacidad();
	
	/**
	 * 
	 * @return el estilo del bar
	 */
	public ESTILOS_BARES getEstilo(); 
	
	/**
	 * 
	 * @return la descripcion del bar
	 */
	public String getDescripcion();
	
	
}
