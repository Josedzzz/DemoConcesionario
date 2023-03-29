package demoConcesionarioCarroUq.model;


import java.util.List;

public class Administrador extends Empleado implements FuncionAdministrador{

	private String credencialAcceso; //Es un dato único de los administradores
	private List<Empleado> listaEmpleados; //Todos los admin deben tener la lista con todos los empleados


	public Administrador(String nombres, String apellidos, String identificacion, String usuario, String contrasenia,
			String correo, String codigoSeguridad, String credencialAcceso, List<Empleado> listaEmpleados) {
		super(nombres, apellidos, identificacion, usuario, contrasenia, correo, codigoSeguridad, true);
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
	/**
	 * Retorna un empleado dado el nombre de usuario
	 * @param concesionario
	 * @param usuario
	 * @return
	 */
	public Empleado obtenerEmpleado(Concesionario concesionario, String usuario) {
		Empleado empleadoEncontrado = null;
		for(Empleado empleado : listaEmpleados) {
			if(empleadoEncontrado.getUsuario().equals(usuario)) {
				empleadoEncontrado = empleado;
			}
		}
		return empleadoEncontrado;
	}

	/**
	 * Devuelve toda la lista de transacciones
	 */
	@Override
	public List<Transaccion> darReporteEmpleado(Concesionario concesionario) {
		// TODO Auto-generated method stub
		List<Transaccion> transacciones = concesionario.getListaTransacciones();
		return transacciones;
	}

	/**
	 * Crea un empleado y lo añade a la lista de empleados
	 */
	@Override
	public void crearEmpleado(Concesionario concesionario, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws Exception {
		// TODO Auto-generated method stub
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado != null) {
			throw new Exception("El empleado ya existe");
		} else {
			Empleado empleadoNuevo = new Empleado(codigoSeguridad, codigoSeguridad, codigoSeguridad, usuario,
					contrasenia, correo, codigoSeguridad, true);
			listaEmpleados.add(empleadoNuevo);
		}
	}

	/**
	 * Actualiza los datos de un empleado, excepto la contraseña, ya que esta es actualizada por recuperar contraseña
	 */
	@Override
	public void actualizarEmpleado(Concesionario concesionario, String nombre, String apellido, String identificacion,
			String usuario, String correo, String codigoSeguridad) throws Exception {
		// TODO Auto-generated method stub
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado == null) {
			throw new Exception("El empleado no está registrado");
		} else {
			empleadoEncontrado.setNombres(nombre);
			empleadoEncontrado.setApellidos(apellido);
			empleadoEncontrado.setIdentificacion(identificacion);
			empleadoEncontrado.setUsuario(usuario);
			empleadoEncontrado.setCorreo(correo);
			empleadoEncontrado.setCodigoSeguridad(codigoSeguridad);
		}
	}

	/**
	 * Cambia el estado cuentaActiva a false de un empleado
	 */
	@Override
	public void bloquearEmpleado(Concesionario concesionario, String usuario) throws Exception {
		// TODO Auto-generated method stub
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado == null) {
			throw new Exception("El empleado no está registrado");
		} else {
			empleadoEncontrado.setCuentaActiva(false);
		}
	}

	/**
	 * Se tiene que terminar, envia un correo a la persona para verificar el cambio de contraseña ingresamdo
	 * la palabra clave
	 */
	@Override
	public void recuperarCuentaEmpleado() {
		// TODO Auto-generated method stub

	}

}
