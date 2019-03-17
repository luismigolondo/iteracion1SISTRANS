package negocio;

import java.sql.Date;

public interface VOReservaServicio {

	public Long getId();
	
	public String getHoraInicio();
	
	public String getHoraFin();
	
	public Cliente getCliente();
	
	public PlanesDeConsumo getPlanDeConsumo();
	
	public Habitacion getHabitacion();
}
