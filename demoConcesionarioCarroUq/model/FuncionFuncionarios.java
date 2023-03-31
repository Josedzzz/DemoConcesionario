package demoConcesionarioCarroUq.model;

import java.util.List;

public interface FuncionFuncionarios {

	//Funciones del admin
	public Empleado obtenerEmpleado(Concesionario concesionario, String usuario);
	public List<Transaccion> darReporteEmpleado(Concesionario concesionario);
	public void crearEmpleado(Concesionario concesionario, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws Exception;
	public void actualizarEmpleado(Concesionario concesionario, String nombre, String apellido, String identificacion,
			String usuario, String correo, String codigoSeguridad) throws Exception;
	public void bloquearEmpleado(Concesionario concesionario, String usuario) throws Exception;
	public void recuperarCuentaEmpleado();


	//Funciones del empleado
	public Vehiculo obtenerVehiculo(Concesionario concesionario, String codigo);
	public void registrarMoto(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje) throws Exception;
}
