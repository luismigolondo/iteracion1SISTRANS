package negocio;

import negocio.Usuario.TIPOS_DE_DOCUMENTO;

public class Empleado implements VOEmpleado{

	public enum ROLES {
		RECEPCIONISTA,
		EMPLEADO,
		ADMIN,
		GERENTE
	}
	private String nombre;
	
	private TIPOS_DE_DOCUMENTO tipoDeIdentificacion;
	
	private Long numeroIdentificacion;
	
	private ROLES rol;
	
	private Double salario;
	
	public Empleado (){
		this.nombre="";
		this.tipoDeIdentificacion=null;
		this.numeroIdentificacion=null;
		this.rol=null;
		this.salario=0.0;
	}
	
	
	/**
	 * 
	 * @param nombre
	 * @param tipoDeIdentificacion
	 * @param numeroIdentificacion
	 * @param rol
	 * @param salario
	 */
	public Empleado(String nombre, TIPOS_DE_DOCUMENTO tipoDeIdentificacion, Long numeroIdentificacion, ROLES rol,
			Double salario) {
		super();
		this.nombre = nombre;
		this.tipoDeIdentificacion = tipoDeIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.rol = rol;
		this.salario = salario;
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
	 * @return the tipoDeIdentificacion
	 */
	public TIPOS_DE_DOCUMENTO getTipoDeIdentificacion() {
		return tipoDeIdentificacion;
	}
	/**
	 * @param tipoDeIdentificacion the tipoDeIdentificacion to set
	 */
	public void setTipoDeIdentificacion(TIPOS_DE_DOCUMENTO tipoDeIdentificacion) {
		this.tipoDeIdentificacion = tipoDeIdentificacion;
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
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
