package demoConcesionarioCarroUq.model;

public class Venta extends Transaccion {

	//private String fecha;

	public Venta(String fecha,  TipoTransaccion tipoTransaccion, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion, Cliente clienteTransaccion) {
		super(fecha, tipoTransaccion, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
	}

	public Venta() {

	}



//------------------------------------------------------------------------------------------------------------------------

}
