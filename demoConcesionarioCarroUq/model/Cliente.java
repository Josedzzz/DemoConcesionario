package demoConcesionarioCarroUq.model;

public class Cliente extends Persona{

	private String codigoCliente;
	private Empleado empleadoCliente;

	public Cliente(String nombres, String apellidos, String identificacion, String codigoCliente,
			Empleado empleadoCliente) {
		super(nombres, apellidos, identificacion);
		this.codigoCliente = codigoCliente;
		this.empleadoCliente = empleadoCliente;
	}

	public Cliente() {

	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Empleado getEmpleadoCliente() {
		return empleadoCliente;
	}

	public void setEmpleadoCliente(Empleado empleadoCliente) {
		this.empleadoCliente = empleadoCliente;
	}

//------------------------------------------------------------------------------------------------------------------------


}
