/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Bar implements VOBar {

	public enum ESTILOS_BARES {
		JAZZ,
		ROCK,
		MODERNA
	}
	
	private String nombre;
	
	private Integer capacidad;
	
	private ESTILOS_BARES estilo;
	
	private String descripcion;
	
	public Bar() {
		this.capacidad = 0;
		this.estilo = null;
		this.descripcion = "";
	}

	/**
	 * @param capacidad
	 * @param estilo
	 * @param descripcion
	 */
	public Bar(Integer capacidad, ESTILOS_BARES estilo, String descripcion) {
		this.capacidad = capacidad;
		this.estilo = estilo;
		this.descripcion = descripcion;
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
	 * @return the estilo
	 */
	public ESTILOS_BARES getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(ESTILOS_BARES estilo) {
		this.estilo = estilo;
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
