package demoConcesionarioCarroUq.model;

public class Alquiler extends Transaccion{

	private int diasAlquiler;
	//private String fecha;

	public Alquiler(double total, TipoTransaccion tipoTransaccion, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion, int diasAlquiler, String fecha) {
		super(fecha, tipoTransaccion, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
		this.diasAlquiler = diasAlquiler;
	}

	public Alquiler() {

	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

//------------------------------------------------------------------------------------------------------------------------

}
