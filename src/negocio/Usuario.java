/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Usuario {

	public enum TIPOS_DE_DOCUMENTO {
		CC,
		TI,
		PASAPORTE
	}
	
	public enum ROLES {
		CLIENTE,
		RECEPCIONISTA,
		EMPLEADO,
		ADMIN,
		GERENTE
	}
	
	private String nombre;
	
	private TIPOS_DE_DOCUMENTO tipoIdentificacion;
	
	private ROLES rol;
	
	private String numeroIdentificacion;
	
	private String correoElectronico;
	
	public Usuario () 
	{
		this.nombre = "";
		this.tipoIdentificacion = null;
		this.rol = null;
		this.numeroIdentificacion = "";
		this.correoElectronico = "";
	}

	/**
	 * @param nombre
	 * @param tipoIdentificacion
	 * @param rol
	 * @param numeroIdentificacion
	 * @param correoElectronico
	 */
	public Usuario(String nombre, TIPOS_DE_DOCUMENTO tipoIdentificacion, ROLES rol, String numeroIdentificacion,
			String correoElectronico) {
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
		this.rol = rol;
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
	 * @return the rol
	 */
	public ROLES getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(ROLES rol) {
		this.rol = rol;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
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
