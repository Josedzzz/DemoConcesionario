package demoConcesionarioCarroUq.model;

public class Cliente extends Persona{

	//private String codigoCliente;
	private Empleado empleadoCliente;

	public Cliente(String nombres, String apellidos, String identificacion, Empleado empleadoCliente) {
		super(nombres, apellidos, identificacion);
		this.empleadoCliente = empleadoCliente;
	}

	public Cliente() {

	}

	public Empleado getEmpleadoCliente() {
		return empleadoCliente;
	}

	public void setEmpleadoCliente(Empleado empleadoCliente) {
		this.empleadoCliente = empleadoCliente;
	}

//------------------------------------------------------------------------------------------------------------------------


}
