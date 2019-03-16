/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Restaurante implements VORestaurante {

	public enum ESTILOS_RESTAURANTES {
		ITALIANO,
		INTERNACIONAL,
		ORIENTAL
	}
	
	private String nombre;
	
	private Integer capacidad;
	
	private ESTILOS_RESTAURANTES estilo;
	
	private String descripcion;
	
	public Restaurante () {
		this.nombre = "";
		this.capacidad = 0;
		this.estilo = null;
		this.descripcion = "";
	}

	/**
	 * @param nombre
	 * @param capacidad
	 * @param estilo
	 * @param descripcion
	 */
	public Restaurante(String nombre, Integer capacidad, ESTILOS_RESTAURANTES estilo, String descripcion) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.estilo = estilo;
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
	public ESTILOS_RESTAURANTES getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(ESTILOS_RESTAURANTES estilo) {
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
	
	
	
}
