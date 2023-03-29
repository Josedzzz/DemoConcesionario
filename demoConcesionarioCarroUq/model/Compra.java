package demoConcesionarioCarroUq.model;

public class Compra extends Transaccion{

	private boolean pasoRevision;

	public Compra(double total, Vehiculo vehiculoTransaccion, Empleado empleadoTransaccion, Cliente clienteTransaccion,
			boolean pasoRevision) {
		super(total, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
		this.pasoRevision = pasoRevision;
	}

	public Compra() {

	}

	public boolean isPasoRevision() {
		return pasoRevision;
	}

	public void setPasoRevision(boolean pasoRevision) {
		this.pasoRevision = pasoRevision;
	}

//------------------------------------------------------------------------------------------------------------------------

}
