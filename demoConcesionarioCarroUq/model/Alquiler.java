package demoConcesionarioCarroUq.model;

public class Alquiler extends Transaccion{

	private int diasAlquiler;
	private String fecha;

	public Alquiler(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion,
			Cliente clienteTransaccion, int diasAlquiler, String fecha) {
		super(total, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
		this.diasAlquiler = diasAlquiler;
		this.fecha = fecha;
	}

	public Alquiler() {

	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



//------------------------------------------------------------------------------------------------------------------------

}
