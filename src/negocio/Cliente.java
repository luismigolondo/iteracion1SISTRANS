/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Cliente implements VOCliente {

	public enum TIPOS_DE_DOCUMENTO {
		CC,
		TI,
		PASAPORTE
	}
	private Long id;
	
	private String nombre;
	
	private TIPOS_DE_DOCUMENTO tipoIdentificacion;
		
	private Long numeroIdentificacion;
	
	private String correoElectronico;
	
	public Cliente () 
	{
		this.id=null;
		this.nombre = "";
		this.tipoIdentificacion = null;
		this.numeroIdentificacion = null;
		this.correoElectronico = "";
	}

	/**
	 * @param nombre
	 * @param tipoIdentificacion
	 * @param rol
	 * @param numeroIdentificacion
	 * @param correoElectronico
	 */
	public Cliente(Long id,String nombre, TIPOS_DE_DOCUMENTO tipoIdentificacion, Long numeroIdentificacion,
			String correoElectronico) {
		this.id=id;
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.correoElectronico = correoElectronico;
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
	 * @return the tipoIdentificacion
	 */
	public TIPOS_DE_DOCUMENTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(TIPOS_DE_DOCUMENTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
}
