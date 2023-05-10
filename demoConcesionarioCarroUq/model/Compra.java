package demoConcesionarioCarroUq.model;

public class Compra extends Transaccion{

	private boolean pasoRevision;
	//private String fecha;

	public Compra(Vehiculo vehiculoTransaccion, TipoTransaccion tipoTransaccion, Empleado empleadoTransaccion, Cliente clienteTransaccion,
			boolean pasoRevision, String fecha) {
		super(fecha, tipoTransaccion, vehiculoTransaccion, empleadoTransaccion, clienteTransaccion);
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
