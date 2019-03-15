/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Supermercado {

	private String nombre;
	
	private String descripcion;
	
	public Supermercado () {
		this.nombre = "";
		this.descripcion = "";
	}

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Supermercado(String nombre, String descripcion) {
		this.nombre = nombre;
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
