/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Salon implements VOSalon{

	public enum TIPOS_SALONES {
		SALON_REUNIONES,
		SALON_CONFERENCIAS
	}
	private String nombre;

	private TIPOS_SALONES tipo;
	
	private Integer capacidad;
	
	private Double costoHora;
	
	private Double costoAdicional;
	
	private String descripcion;
	
	public Salon () {
		this.tipo = null;
		this.capacidad = 0;
		this.costoHora = 0.0;
		this.costoAdicional = 0.0;
		this.descripcion = "";
	}

	/**
	 * @param tipo
	 * @param capacidad
	 * @param costoHora
	 * @param costoAdicional
	 * @param descripcion
	 */
	public Salon(TIPOS_SALONES tipo, Integer capacidad, Double costoHora, Double costoAdicional, String descripcion) {
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.costoHora = costoHora;
		this.costoAdicional = costoAdicional;
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipo
	 */
	public TIPOS_SALONES getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TIPOS_SALONES tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the capacidad
	 */
	public Integer getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the costoHora
	 */
	public Double getCostoHora() {
		return costoHora;
	}

	/**
	 * @param costoHora the costoHora to set
	 */
	public void setCostoHora(Double costoHora) {
		this.costoHora = costoHora;
	}

	/**
	 * @return the costoAdicional
	 */
	public Double getCostoAdicional() {
		return costoAdicional;
	}

	/**
	 * @param costoAdicional the costoAdicional to set
	 */
	public void setCostoAdicional(Double costoAdicional) {
		this.costoAdicional = costoAdicional;
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
