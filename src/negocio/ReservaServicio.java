package negocio;

import java.sql.Date;

public class ReservaServicio implements VOReservaServicio {

	/**
	 *  id del servicio
	 */
	private long id;
	
	/**
	 * hora de inicio del servicio
	 */
	private String horaInicio;
	
	/**
	 * hora de finalizacion del servicio
	 */
	private String horaFin;

	private Cliente cliente;
	
	private PlanesDeConsumo planDeConsumo;
	
	private Habitacion habitacion;
	
	public ReservaServicio() {
		this.id = 0;
		this.horaInicio = null;
		this.horaFin = null;
		this.cliente = null;
		this.planDeConsumo = null;
		this.habitacion = null;
	}
	
	public ReservaServicio(Long id, String horaInicio, String horaFin, Cliente cliente, PlanesDeConsumo planDeConsumo,
			Habitacion habitacion) {
		this.id = id;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.cliente = cliente;
		this.planDeConsumo = planDeConsumo;
		this.habitacion = habitacion;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the horaInicio
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFin
	 */
	public String getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PlanesDeConsumo getPlanDeConsumo() {
		return planDeConsumo;
	}

	public void setPlanDeConsumo(PlanesDeConsumo planDeConsumo) {
		this.planDeConsumo = planDeConsumo;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	
}
