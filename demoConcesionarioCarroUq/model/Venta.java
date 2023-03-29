package demoConcesionarioCarroUq.model;

public class Venta extends Transaccion {

	private String fecha;

	public Venta(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion, Cliente clienteTransaccion,
			String fecha) {
		super(total, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
		this.fecha = fecha;
	}

	public Venta() {

	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

//------------------------------------------------------------------------------------------------------------------------

}
