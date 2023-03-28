package demoConcesionarioCarroUq.model;

public class Transaccion {

	private double total;
	private Vehiculo vehiculoTransaccion;
	private Empleado empleadoTransaccion;
	private Cliente clienteTransaccion;
	private TipoTransaccion tipoTransaccion;
	private boolean pasoRevision; //Es por si un cliente desea vender un vehiculo
	private int diasAlquiler; //Es por si un clietne desea alquilar un vehiculo

	public Transaccion(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion, TipoTransaccion tipoTransaccion, boolean pasoRevision, int diasAlquiler) {
		super();
		this.total = total;
		this.vehiculoTransaccion = vehiculoTransaccion;
		this.empleadoTransaccion = empleadoTransaccion;
		this.clienteTransaccion = clienteTransaccion;
		this.tipoTransaccion = tipoTransaccion;
		this.pasoRevision = pasoRevision;
		this.diasAlquiler = diasAlquiler;
	}

	public Transaccion() {

	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Vehiculo getVehiculoTransaccion() {
		return vehiculoTransaccion;
	}

	public void setVehiculoTransaccion(Vehiculo vehiculoTransaccion) {
		this.vehiculoTransaccion = vehiculoTransaccion;
	}

	public Empleado getEmpleadoTransaccion() {
		return empleadoTransaccion;
	}

	public void setEmpleadoTransaccion(Empleado empleadoTransaccion) {
		this.empleadoTransaccion = empleadoTransaccion;
	}

	public Cliente getClienteTransaccion() {
		return clienteTransaccion;
	}

	public void setClienteTransaccion(Cliente clienteTransaccion) {
		this.clienteTransaccion = clienteTransaccion;
	}

	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public boolean isPasoRevision() {
		return pasoRevision;
	}

	public void setPasoRevision(boolean pasoRevision) {
		this.pasoRevision = pasoRevision;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}


//-----------------------------------------------------------------------------------------------------------------------



}
