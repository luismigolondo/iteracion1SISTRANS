package negocio;

import negocio.Lavanderia.TIPO_LAVADO;

/**
 * Interfaz para los metodos get de LAVANDERIA
 * @author jd.diazc
 *
 */
public interface VOLavanderia {
	
	/**
	 * 
	 * @return el numero de prendas de lavanderia
	 */
	public Integer getNumPrendas();
	
	/**
	 * 
	 * @return el costo de lavanderia
	 */
	public Double getCosto();
	
	/**
	 * 
	 * @return el tipo de lavanderia
	 */
	public TIPO_LAVADO getTipo();
}
