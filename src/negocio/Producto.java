/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Producto {

	private Integer id;
	
	private String nombre;
	
	private Double valor;
	
	private Integer idServicio;
	
	public Producto () {
		this.id = 0;
		this.nombre = "";
		this.valor = 0.0;
		this.idServicio = 0;
	}

	/**
	 * @param id
	 * @param nombre
	 * @param valor
	 * @param idServicio
	 */
	public Producto(Integer id, String nombre, Double valor, Integer idServicio) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.idServicio = idServicio;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * @return the idServicio
	 */
	public Integer getIdServicio() {
		return idServicio;
	}

	/**
	 * @param idServicio the idServicio to set
	 */
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	
	
	
}
