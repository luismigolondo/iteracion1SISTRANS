/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Hotel implements VOHotel{
	
	private Integer estrellas;
	
	private String nombre;

	private Long id;
	
	public Hotel() {
		estrellas = 0;
		nombre = null;
		id=null;
	}
	
	public Hotel(Long id,Integer numeroEstrellas, String nombre) {
		this.estrellas = numeroEstrellas;
		this.id=id;
		this.nombre=nombre;
	}

	/**
	 * @return the estrellas
	 */
	public Integer getEstrellas() {
		return estrellas;
	}

	/**
	 * @param estrellas the estrellas to set
	 */
	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
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
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
}
