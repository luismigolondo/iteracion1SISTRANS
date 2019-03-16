/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Prestamo implements VOPrestamo{

	//TODO REVISAR
	public enum UTENSILIOS {
		TOALLA
	}
	
	private UTENSILIOS item;
	
	private Double costo;
	
	public Prestamo () {
		this.item = null;
		this.costo = 0.0;
	}

	/**d
	 * @param item
	 * @param condicionDeEntrega
	 */
	public Prestamo(UTENSILIOS item, Double costo) {
		this.item = item;
		this.costo = costo;
	}

	/**
	 * @return the item
	 */
	public UTENSILIOS getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(UTENSILIOS item) {
		this.item = item;
	}

	/**
	 * @return the condicionDeEntrega
	 */
	public Double getCosto() {
		return costo;
	}

	/**
	 * @param condicionDeEntrega the condicionDeEntrega to set
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}



}
