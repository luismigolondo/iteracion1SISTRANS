/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Cuenta {

	private Double total;
	
	public Cuenta () {
		this.total = 0.0;
	}

	/**
	 * @param total
	 */
	public Cuenta(Double total) {
		this.total = total;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
}
