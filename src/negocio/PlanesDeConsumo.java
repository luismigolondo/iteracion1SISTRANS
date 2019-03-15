/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class PlanesDeConsumo {

	public enum PLANES_DE_CONSUMO {
		LARGA_ESTADIA,
		TIEMPO_COMPARTIDO,
		TODO_INCLUIDO
	}
	
	private PLANES_DE_CONSUMO tipo;
	
	private Double descuento;
	
	private Integer minNoches;
	
	private Double costoFijo;
	
	public PlanesDeConsumo () {
		this.tipo = null;
		this.descuento = 0.0;
		this.minNoches = 0;
		this.costoFijo = 0.0;
	}

	/**
	 * @param tipo
	 * @param descuento
	 * @param minNoches
	 * @param costoFijo
	 */
	public PlanesDeConsumo(PLANES_DE_CONSUMO tipo, Double descuento, Integer minNoches, Double costoFijo) {
		this.tipo = tipo;
		this.descuento = descuento;
		this.minNoches = minNoches;
		this.costoFijo = costoFijo;
	}

	/**
	 * @return the tipo
	 */
	public PLANES_DE_CONSUMO getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(PLANES_DE_CONSUMO tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the descuento
	 */
	public Double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the minNoches
	 */
	public Integer getMinNoches() {
		return minNoches;
	}

	/**
	 * @param minNoches the minNoches to set
	 */
	public void setMinNoches(Integer minNoches) {
		this.minNoches = minNoches;
	}

	/**
	 * @return the costoFijo
	 */
	public Double getCostoFijo() {
		return costoFijo;
	}

	/**
	 * @param costoFijo the costoFijo to set
	 */
	public void setCostoFijo(Double costoFijo) {
		this.costoFijo = costoFijo;
	}
	
	
}
