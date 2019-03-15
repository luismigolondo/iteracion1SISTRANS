package negocio;

import negocio.PlanesDeConsumo.PLANES_DE_CONSUMO;

/**
 * Interfaz para los metodos get de Planes de Consumio
 * @author jd.diazc
 *
 */
public interface VOPlanesDeConsumo {
	
	/**
	 * 
	 * @return el tipo
	 */
	public PLANES_DE_CONSUMO getTipo();
	
	/**
	 * 
	 * @return el descuento
	 */
	public Double getDescuento();
	
	/**
	 * 
	 * @return el minimo de noches
	 */
	public Integer getMinNoches();
	
	/**
	 * 
	 * @return el costo fijo
	 */
	public Double getCostoFijo();
	
}
