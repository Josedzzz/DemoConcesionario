package demoConcesionarioCarroUq.model;

public class Compra extends Transaccion{

	private boolean pasoRevision;
	private String fecha;

	public Compra(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion, Cliente clienteTransaccion,
			boolean pasoRevision, String fecha) {
		super(total, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
		this.pasoRevision = pasoRevision;
		this.fecha = fecha;
	}

	public Compra() {

	}

	public boolean isPasoRevision() {
		return pasoRevision;
	}

	public void setPasoRevision(boolean pasoRevision) {
		this.pasoRevision = pasoRevision;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


//------------------------------------------------------------------------------------------------------------------------

}
