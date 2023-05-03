package demoConcesionarioCarroUq.model;

import java.util.List;

public interface FuncionAdministrador {

	//Funciones del admin
	public Empleado obtenerEmpleado(Concesionario concesionario, String usuario);
	public List<Transaccion> darReporteEmpleado(Concesionario concesionario);
	public boolean crearEmpleado(Concesionario concesionario, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws Exception;
	public void actualizarEmpleado(Concesionario concesionario, String nombre, String apellido, String identificacion,
			String usuario, String correo) throws Exception;
	public void bloquearEmpleado(Concesionario concesionario, String usuario) throws Exception;
	public void recuperarCuentaEmpleado();

}
