/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Hotel {
	
	public Integer estrellas;
	
	public Hotel() {
		estrellas = 0;
	}
	
	public Hotel(Integer numeroEstrellas) {
		this.estrellas = numeroEstrellas;
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
	
	
	
}
