package negocio;

import java.sql.Date;

public interface VOReservaServicio {

	public long getId();
	
	public String getHoraInicio();
	
	public String getHoraFin();
	
	public Cliente getCliente();
	
	public PlanesDeConsumo getPlanDeConsumo();
	
	public Habitacion getHabitacion();
}
