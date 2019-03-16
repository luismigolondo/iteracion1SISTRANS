/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Internet implements VOInternet {

	private Double capacidad;
	
	private Double costo;
	
	private String descripcion;
	
	public Internet() {
		this.capacidad = 0.0;
		this.costo = 0.0;
		this.descripcion = "";
	}

	/**
	 * @param capacidad
	 * @param costo
	 * @param descripcion
	 */
	public Internet(Double capacidad, Double costo, String descripcion) {
		this.capacidad = capacidad;
		this.costo = costo;
		this.descripcion = descripcion;
	}

	/**
	 * @return the capacidad
	 */
	public Double getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
