package demoConcesionarioCarroUq.model;

public class Transaccion {

	//protected double total;
	protected String fecha;
	protected TipoTransaccion tipoTransaccion;
	protected Vehiculo vehiculoTransaccion;
	protected Empleado empleadoTransaccion;
	protected Cliente clienteTransaccion;



	public Transaccion(String fecha, TipoTransaccion tipoTransaccion, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion) {
		super();
		this.fecha = fecha;
		this.tipoTransaccion = tipoTransaccion;
		this.vehiculoTransaccion = vehiculoTransaccion;
		this.empleadoTransaccion = empleadoTransaccion;
		this.clienteTransaccion = clienteTransaccion;
	}

	public Transaccion() {

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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}



//-----------------------------------------------------------------------------------------------------------------------



}
