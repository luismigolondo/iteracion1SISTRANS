package negocio;

import negocio.Salon.TIPOS_SALONES;

/**
 * Interfaz para los metodos get de SALON
 * @author jd.diazc
 *
 */
public interface VOSalon {

	/**
	 * 
	 * @return el nombre
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return el tipo
	 */
	public TIPOS_SALONES getTipo();
	
	/**
	 * 
	 * @return la capacidad
	 */
	public Integer getCapacidad();
	
	/**
	 * 
	 * @return el costo por hora
	 */
	public Double getCostoHora();
	
	/**
	 * 
	 * @return el costo adicional
	 */
	public Double getCostoAdicional();
	
	/**
	 * 
	 * @return la descripcion
	 */
	public String getDescripcion();
}
