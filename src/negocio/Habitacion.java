/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Habitacion implements VOHabitacion{

	public enum TIPOS_DE_HABITACION {
		SUITE,
		SUITE_PRESIDENCIAL,
		SENCILLA
	}
	
	private Integer numeroHabitacion;
	
	private Integer capacidad;
	
	private String dotacion;
	
	private TIPOS_DE_HABITACION tipo;
	
	public Habitacion () {
		this.numeroHabitacion = 0;
		this.capacidad = 0;
		this.dotacion = "";
		this.tipo = null;
	}

	/**
	 * @param numeroHabitacion
	 * @param capacidad
	 * @param dotacion
	 * @param tipo
	 */
	public Habitacion(Integer numeroHabitacion, Integer capacidad, String dotacion, TIPOS_DE_HABITACION tipo) {
		this.numeroHabitacion = numeroHabitacion;
		this.capacidad = capacidad;
		this.dotacion = dotacion;
		this.tipo = tipo;
	}

	/**
	 * @return the numeroHabitacion
	 */
	public Integer getNumeroHabitacion() {
		return numeroHabitacion;
	}

	/**
	 * @param numeroHabitacion the numeroHabitacion to set
	 */
	public void setNumeroHabitacion(Integer numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
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
	 * @return the dotacion
	 */
	public String getDotacion() {
		return dotacion;
	}

	/**
	 * @param dotacion the dotacion to set
	 */
	public void setDotacion(String dotacion) {
		this.dotacion = dotacion;
	}

	/**
	 * @return the tipo
	 */
	public TIPOS_DE_HABITACION getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TIPOS_DE_HABITACION tipo) {
		this.tipo = tipo;
	}
	
	
	
}
