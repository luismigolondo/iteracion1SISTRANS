package negocio;

/**
 * 
 * @author luisgomez
 *
 */
public class Gasto implements VOGasto {

	private long idHabitacion;
	
	private long idProducto;
	
	/**
	 * Constructor de gasto
	 */
	public Gasto(){
		this.idHabitacion = 0;
		this.idProducto = 0;
	}

	/**
	 * @param idHabitacion
	 * @param idProducto
	 */
	public Gasto(long idHabitacion, long idProducto) {
		this.idHabitacion = idHabitacion;
		this.idProducto = idProducto;
	}

	/**
	 * @return the idHabitacion
	 */
	public long getIdHabitacion() {
		return idHabitacion;
	}

	/**
	 * @param idHabitacion the idHabitacion to set
	 */
	public void setIdHabitacion(long idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	/**
	 * @return the idProducto
	 */
	public long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	
}
