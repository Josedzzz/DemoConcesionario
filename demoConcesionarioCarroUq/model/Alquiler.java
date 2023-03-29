package demoConcesionarioCarroUq.model;

public class Alquiler extends Transaccion{

	private int diasAlquiler;

	public Alquiler(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion, int diasAlquiler) {
		super(total, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
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
