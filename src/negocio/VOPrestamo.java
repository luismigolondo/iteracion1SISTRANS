package negocio;

import negocio.Prestamo.UTENSILIOS;

/**
 * Interfaz para los metodos get de Planes de Consumio
 * @author jd.diazc
 *
 */
public interface VOPrestamo {
	
	/**
	 * 
	 * @return el item
	 */
	public UTENSILIOS getItem();
	
	/**
	 * 
	 * @return la condicion de entrega
	 */
	public Double getCosto();
}
