package demoConcesionarioCarroUq.model;

import java.util.ArrayList;
import java.util.List;

import demoConcesionarioCarroUq.exceptions.EmpleadoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.EmpleadoYaExistenteException;

public class Concesionario {

	private String nombre;
	private List<Empleado> listaEmpleados;
	private List<Administrador> listaAdministradores;
	private List<Cliente> listaClientes;
	private List<Transaccion> listaTransacciones;
	private List<Vehiculo> listaVehiculos;

	public Concesionario(String nombre) {
		super();
		this.nombre = nombre;
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaAdministradores = new ArrayList<Administrador>();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaTransacciones = new ArrayList<Transaccion>();
		this.listaVehiculos = new ArrayList<Vehiculo>();

		//Inicializo datos para probarlos
		Administrador admin1 = new Administrador("Jose", "Amaya", "123", "jose", "1234", "josed@", "11111");
		listaAdministradores.add(admin1);
		Empleado empleado1 = new Empleado("Nico", "Gomez", "321", "Nico", "321", "nico@", "22222", true);
		listaEmpleados.add(empleado1);
		Empleado empleado2 = new Empleado("Miguel", "Montes", "444", "migue", "444", "migue@", "44444", true);
		listaEmpleados.add(empleado2);
	}

	public Concesionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public List<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}

	public void setListaAdministradores(List<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

//-----------------------------------------------------------------------------------------------------------------------
//-------------------------------------FUNCIONES INICIO SESION-----------------------------------------------------------
	/**
	 * Me da un administrador dado un usuario y contraseña
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public Administrador darAdministradorSesion(String usuario, String contrasenia) {
		Administrador adminEncontrado = null;
		for(Administrador administrador : listaAdministradores) {
			if(administrador.getUsuario().equals(usuario) && administrador.getContrasenia().equals(contrasenia)) {
				adminEncontrado = administrador;
			}
		}
		return adminEncontrado;
	}

	/**
	 * Me da un empleado dado un usuario y contraseña
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public Empleado darEmpleadoSesion(String usuario, String contrasenia) {
		Empleado empleadoEncontrado = null;
		for(Empleado empleado : listaEmpleados) {
			if(empleado.getUsuario().equals(usuario) && empleado.getContrasenia().equals(contrasenia)) {
				empleadoEncontrado = empleado;
			}
		}
		return empleadoEncontrado;
	}


//------------------------------------------------------------------------------------------------------------------------
//--------------------------------------FUNCIONALIDADES DEL ADMINISTRADOR-------------------------------------------------
	/**
	 * Actualiza los datos del empleado
	 * @param concesionario
	 * @param adminActual
	 * @param nombre2
	 * @param apellido
	 * @param identificacion
	 * @param usuario
	 * @param contrasenia
	 * @param correo
	 * @param codigoSeguridad
	 * @throws EmpleadoNoRegistradoException
	 */
	public void actualizarEmpleado(Concesionario concesionario, Administrador adminActual, String nombre2,
			String apellido, String identificacion, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws EmpleadoNoRegistradoException {

		adminActual.actualizarEmpleado(concesionario, nombre2, apellido, identificacion, usuario, correo);
	}

	/**
	 * Crea un empleado
	 * @param concesionario
	 * @param adminActual
	 * @param nombre2
	 * @param apellido
	 * @param identificacion
	 * @param usuario
	 * @param contrasenia
	 * @param correo
	 * @param codigoSeguridad
	 * @return
	 * @throws EmpleadoYaExistenteException
	 */
	public boolean crearEmpleado(Concesionario concesionario, Administrador adminActual, String nombre2,
			String apellido, String identificacion, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws EmpleadoYaExistenteException {
		// TODO Auto-generated method stub
		return adminActual.crearEmpleado(concesionario, usuario, contrasenia, correo, codigoSeguridad);
	}

	/**
	 * Bloquea la cuenta de un empleado
	 * @param concesionario
	 * @param adminActual
	 * @param usuario
	 * @throws EmpleadoNoRegistradoException
	 */
	public void bloquearEmpleado(Concesionario concesionario, Administrador adminActual, String usuario) throws EmpleadoNoRegistradoException {
		adminActual.bloquearEmpleado(concesionario, usuario);
	}


}
