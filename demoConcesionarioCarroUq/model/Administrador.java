package demoConcesionarioCarroUq.model;


import java.util.List;

public class Administrador extends Empleado implements FuncionAdministrador{

	private String credencialAcceso; //Es un dato único de los administradores
	private List<Empleado> listaEmpleados; //Todos los admin deben tener la lista con todos los empleados


	public Administrador(String nombres, String apellidos, String identificacion, String usuario, String contrasenia,
			String correo, String codigoSeguridad, String credencialAcceso, List<Empleado> listaEmpleados) {
		super(nombres, apellidos, identificacion, usuario, contrasenia, correo, codigoSeguridad);
		this.credencialAcceso = credencialAcceso;
		this.listaEmpleados = listaEmpleados;
	}

	public Administrador() {

	}

	public String getCredencialAcceso() {
		return credencialAcceso;
	}

	public void setCredencialAcceso(String credencialAcceso) {
		this.credencialAcceso = credencialAcceso;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}


//-----------------------------------------------------------------------------------------------------------------------
	@Override
	public void darReporteEmpleado() {

	}

	@Override
	public void crearEmpleado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarEmpleado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarEmpleado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recuperarCuentaEmpleado() {
		// TODO Auto-generated method stub

	}

}
