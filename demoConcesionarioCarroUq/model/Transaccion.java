package demoConcesionarioCarroUq.model;

public abstract class Transaccion {

	protected double total;
	protected Vehiculo vehiculoTransaccion;
	protected Empleado empleadoTransaccion;
	protected Cliente clienteTransaccion;

	public Transaccion(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion) {
		super();
		this.total = total;
		this.vehiculoTransaccion = vehiculoTransaccion;
		this.empleadoTransaccion = empleadoTransaccion;
		this.clienteTransaccion = clienteTransaccion;
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

//-----------------------------------------------------------------------------------------------------------------------



}
