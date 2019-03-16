/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Lavanderia implements VOLavanderia{

	public enum TIPO_LAVADO {
		LAVADO,
		PLANCHADO,
		EMBOLADO
	}
	private String nombre;
	
	private Integer numPrendas;
	
	private Double costo;
	
	private TIPO_LAVADO tipo;
	
	public Lavanderia () {
		this.numPrendas = 0;
		this.costo = 0.0;
		this.tipo = null;
	}

	/**
	 * @param numPrendas
	 * @param costo
	 * @param tipo
	 */
	public Lavanderia(Integer numPrendas, Double costo, TIPO_LAVADO tipo) {
		this.numPrendas = numPrendas;
		this.costo = costo;
		this.tipo = tipo;
	}

	/**
	 * @return the numPrendas
	 */
	public Integer getNumPrendas() {
		return numPrendas;
	}

	/**
	 * @param numPrendas the numPrendas to set
	 */
	public void setNumPrendas(Integer numPrendas) {
		this.numPrendas = numPrendas;
	}

	/**
	 * @return the costo
	 */
	public Double getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	/**
	 * @return the tipo
	 */
	public TIPO_LAVADO getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TIPO_LAVADO tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
