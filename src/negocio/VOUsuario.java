package negocio;

import negocio.Usuario.TIPOS_DE_DOCUMENTO;

/**
 * Interfaz para los metodos get de USUARIO
 * @author jd.diazc
 *
 */
public interface VOUsuario {

	/**
	 * 
	 * @return el nombre
	 */
	public String getNombre();
	
	/**
	 * 
	 * @return el tipo de documento
	 */
	public TIPOS_DE_DOCUMENTO getTipoIdentificacion();
	
	/**
	 * 
	 * @return el numero del documento de identificacion
	 */
	public Long getNumeroIdentificacion();
	
	/**
	 * 
	 * @return el correo electronico
	 */
	public String getCorreoElectronico();
	
}
