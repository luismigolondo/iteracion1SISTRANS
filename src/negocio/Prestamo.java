/**
 * 
 */
package negocio;

/**
 * @author luisgomez
 *
 */
public class Prestamo {

	//TODO REVISAR
	public enum UTENSILIOS {
		TOALLA
	}
	
	private UTENSILIOS item;
	
	private String condicionDeEntrega;
	
	public Prestamo () {
		this.item = null;
		this.condicionDeEntrega = "";
	}

	/**
	 * @param item
	 * @param condicionDeEntrega
	 */
	public Prestamo(UTENSILIOS item, String condicionDeEntrega) {
		this.item = item;
		this.condicionDeEntrega = condicionDeEntrega;
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
	public String getCondicionDeEntrega() {
		return condicionDeEntrega;
	}

	/**
	 * @param condicionDeEntrega the condicionDeEntrega to set
	 */
	public void setCondicionDeEntrega(String condicionDeEntrega) {
		this.condicionDeEntrega = condicionDeEntrega;
	}
	
	
	
}
