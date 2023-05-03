package demoConcesionarioCarroUq.model;


import java.util.List;

import demoConcesionarioCarroUq.exceptions.EmpleadoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.EmpleadoYaExistenteException;

public class Administrador extends Empleado implements FuncionAdministrador{

	//private String credencialAcceso; //Es un dato único de los administradores

	public Administrador(String nombres, String apellidos, String identificacion, String usuario, String contrasenia,
			String correo, String codigoSeguridad) {
		super(nombres, apellidos, identificacion, usuario, contrasenia, correo, codigoSeguridad, true);
		//this.credencialAcceso = credencialAcceso;
	}

	public Administrador() {

	}

	/*public String getCredencialAcceso() {
		return credencialAcceso;
	}

	public void setCredencialAcceso(String credencialAcceso) {
		this.credencialAcceso = credencialAcceso;
	}*/




//-----------------------------------------------------------------------------------------------------------------------
	/**
	 * Retorna un empleado dado el nombre de usuario
	 * @param concesionario
	 * @param usuario
	 * @return
	 */
	@Override
	public Empleado obtenerEmpleado(Concesionario concesionario, String usuario) {
		List<Empleado> empleados = concesionario.getListaEmpleados();
		Empleado empleadoEncontrado = null;
		for(Empleado empleado : empleados) {
			if(empleado.getUsuario().equals(usuario)) {
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
	public boolean crearEmpleado(Concesionario concesionario, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws EmpleadoYaExistenteException {
		// TODO Auto-generated method stub
		boolean fueCreado = false;
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado != null) {
			throw new EmpleadoYaExistenteException("El empleado ya existe");
		} else {
			Empleado empleadoNuevo = new Empleado(codigoSeguridad, codigoSeguridad, codigoSeguridad, usuario,
					contrasenia, correo, codigoSeguridad, true);
			concesionario.getListaEmpleados().add(empleadoNuevo);
			fueCreado = true;
		}
		return fueCreado;
	}

	/**
	 * Actualiza los datos de un empleado, excepto la contraseña, ya que esta es actualizada por recuperar contraseña
	 */
	@Override
	public void actualizarEmpleado(Concesionario concesionario, String nombre, String apellido, String identificacion,
			String usuario, String correo) throws EmpleadoNoRegistradoException {
		// TODO Auto-generated method stub
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado == null) {
			throw new EmpleadoNoRegistradoException("El empleado no está registrado");
		} else {
			empleadoEncontrado.setNombres(nombre);
			empleadoEncontrado.setApellidos(apellido);
			empleadoEncontrado.setIdentificacion(identificacion);
			empleadoEncontrado.setCorreo(correo);
		}
	}

	/**
	 * Cambia el estado cuentaActiva a false de un empleado
	 */
	@Override
	public void bloquearEmpleado(Concesionario concesionario, String usuario)
		throws EmpleadoNoRegistradoException {
		// TODO Auto-generated method stub
		Empleado empleadoEncontrado = obtenerEmpleado(concesionario, usuario);
		if(empleadoEncontrado == null) {
			throw new EmpleadoNoRegistradoException("El empleado no está registrado");
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
