/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Usuario implements VOUsuario {

	public enum TIPOS_DE_DOCUMENTO {
		CC,
		TI,
		PASAPORTE
	}

	private String nombre;
	
	private TIPOS_DE_DOCUMENTO tipoIdentificacion;
		
	private Long numeroIdentificacion;
	
	private String correoElectronico;
	
	public Usuario () 
	{
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
	public Usuario(String nombre, TIPOS_DE_DOCUMENTO tipoIdentificacion, Long numeroIdentificacion,
			String correoElectronico) {
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.correoElectronico = correoElectronico;
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
