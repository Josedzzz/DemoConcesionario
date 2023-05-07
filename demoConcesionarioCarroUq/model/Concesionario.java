package demoConcesionarioCarroUq.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

		//Incializo datos de transacciones para probarlos
		Cliente cliente1 = new Cliente("Manuel", "Restrepo", "1023412", empleado1);
		Cliente cliente2 = new Cliente("Andres", "Garcia", "1023456", empleado2);
		Van vehiculo1 = new Van("123-Van", "10000000", "Reanult", CondicionVehiculo.NUEVO, "2020", 5, 200, TipoVehiculo.GASOLINA, 0, 0, false, false, "1206", 8, 4, true, true, 2, true, TransmisionVehiculo.MANUAL, 20);
		Moto vehiculo2 = new Moto("321-Moto", "2000000", "kawasaki", CondicionVehiculo.USADO, "2021", 5, 260, TipoVehiculo.DIESEL, 0, 0, false, false, "350");
		Transaccion transaccion1 = new Transaccion("6/05/2023", vehiculo1, empleado1, cliente1);
		Transaccion transaccion2 = new Transaccion("10/05/2023", vehiculo2, empleado2, cliente2);
		listaTransacciones.add(transaccion1);
		listaTransacciones.add(transaccion2);
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
//-------------------------------------FUNCIONES FUNCIONALIDADES DEL ADMINISTRADOR----------------------------------------
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

	/**
	 * Vlida que las fechas del reporte esten correctas, la fecha incial tiene que ser menor que la final
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 * @throws ParseException Es por si las fechas no estan en el formato correcto
	 */
	public boolean validarFechas(String fechaInicial, String fechaFinal) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Date fechaInicio = sdf.parse(fechaInicial);
		Date fechaFin = sdf.parse(fechaFinal);
		return fechaInicio.before(fechaFin);
	}

	/**
	 * Devuelve una lista de las transacciones que esten dentro de la fecha incial y final
	 * Tiene try catch para manejar el ParseException desde aquí
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 */
	public ArrayList<Transaccion> getListaDatosTransacciones(String fechaInicial, String fechaFinal) {
		ArrayList<Transaccion> listaDatosTransacciones = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date fechaIncio = sdf.parse(fechaInicial);
			Date fechaFin = sdf.parse(fechaFinal);
			for (Transaccion transaccion : listaTransacciones) {
				Date fechaTransaccion = sdf.parse(transaccion.getFecha());
				if (fechaTransaccion.after(fechaIncio) && fechaTransaccion.before(fechaFin)) {
					listaDatosTransacciones.add(transaccion);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return listaDatosTransacciones;
	}


}
