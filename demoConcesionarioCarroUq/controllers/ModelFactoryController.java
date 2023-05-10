package demoConcesionarioCarroUq.controllers;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Filter;

import demoConcesionarioCarroUq.exceptions.EmpleadoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.EmpleadoYaExistenteException;
import demoConcesionarioCarroUq.model.Administrador;
import demoConcesionarioCarroUq.model.Cliente;
import demoConcesionarioCarroUq.model.Concesionario;
import demoConcesionarioCarroUq.model.CondicionVehiculo;
import demoConcesionarioCarroUq.model.Empleado;
import demoConcesionarioCarroUq.model.Moto;
import demoConcesionarioCarroUq.model.TipoTransaccion;
import demoConcesionarioCarroUq.model.TipoVehiculo;
import demoConcesionarioCarroUq.model.Transaccion;
import demoConcesionarioCarroUq.model.TransmisionVehiculo;
import demoConcesionarioCarroUq.model.Van;

public class ModelFactoryController {

	Concesionario concesionario = null;

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	private static class SingletonHolder {
		//El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	//Método para obtener la instacia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		System.out.println("invocacion clase singleton");
		inicializarDatos();
	}

	private void inicializarDatos() {
		concesionario = new Concesionario("Carro uq");
		//Inicializo datos para probarlos
		Administrador admin1 = new Administrador("Jose", "Amaya", "123", "jose", "1234", "josed@", "11111");
		concesionario.getListaAdministradores().add(admin1);
		Empleado empleado1 = new Empleado("Nico", "Gomez", "321", "Nico", "321", "nico@", "22222", true);
		concesionario.getListaEmpleados().add(empleado1);
		Empleado empleado2 = new Empleado("Miguel", "Montes", "444", "migue", "444", "migue@", "44444", true);
		concesionario.getListaEmpleados().add(empleado2);

		//Incializo datos de transacciones para probarlos
		Cliente cliente1 = new Cliente("Manuel", "Restrepo", "1023412", empleado1);
		Cliente cliente2 = new Cliente("Andres", "Garcia", "1023456", empleado2);
		Van vehiculo1 = new Van("123-Van", "10000000", "Reanult", CondicionVehiculo.NUEVO, "2020", 5, 200, TipoVehiculo.GASOLINA, 0, 0, false, false, "1206", 8, 4, true, true, 2, true, TransmisionVehiculo.MANUAL, 20);
		Moto vehiculo2 = new Moto("321-Moto", "2000000", "kawasaki", CondicionVehiculo.USADO, "2021", 5, 260, TipoVehiculo.DIESEL, 0, 0, false, false, "350");
		Transaccion transaccion1 = new Transaccion("6/05/2023", TipoTransaccion.VENTA, vehiculo1, empleado1, cliente1);
		Transaccion transaccion2 = new Transaccion("10/05/2023", TipoTransaccion.COMPRA, vehiculo2, empleado2, cliente2);
		concesionario.getListaTransacciones().add(transaccion1);
		concesionario.getListaTransacciones().add(transaccion2);
	}

//---------------------------------------------------------------------------------------------------------------------
//-------------------------------------------FUNCIONES GENERALES PARA LISTADOS-----------------------------------------
	/**
	 * Me devuelve la lista de empleados del concesionario
	 * @return
	 */
	public List<Empleado> getListaEmpleados() {
		return concesionario.getListaEmpleados();
	}
//-----------------------------------------------------------------------------------------------------------------------
//--------------------------------------------FUNCIONES DE INICIO SESION-------------------------------------------------
	/**
	 * Me retorna el administrador encontrado
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public Administrador darAdministradorSesion(String usuario, String contrasenia) {
		return concesionario.darAdministradorSesion(usuario, contrasenia);
	}

	/**
	 * Me retorna el empleado encontrado
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public Empleado darEmpleadoSesion(String usuario, String contrasenia) {
		return concesionario.darEmpleadoSesion(usuario, contrasenia);
	}

//-----------------------------------------------------------------------------------------------------------------------
//-------------------------------------FUNCIONES FUNCIONALIDAD ADMINISTRADOR---------------------------------------------

	/**
	 * Actualiza todos los datos del empleado excepto el usuario, contrasenia y codigoSeguridad
	 * @param concesionario2
	 * @param adminActual
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param usuario
	 * @param contrasenia
	 * @param correo
	 * @param codigoSeguridad
	 * @throws EmpleadoNoRegistradoException
	 */
	public void actualizarEmpleado(Concesionario concesionario2, Administrador adminActual, String nombre,
			String apellido, String identificacion, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws EmpleadoNoRegistradoException {

		concesionario.actualizarEmpleado(concesionario, adminActual, nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad);
	}

	/**
	 * Crea un empleado con los datos necesarios
	 * @param concesionario2
	 * @param adminActual
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param usuario
	 * @param contrasenia
	 * @param correo
	 * @param codigoSeguridad
	 * @return
	 * @throws EmpleadoYaExistenteException
	 */
	public boolean crearEmpleado(Concesionario concesionario2, Administrador adminActual, String nombre,
			String apellido, String identificacion, String usuario, String contrasenia, String correo,
			String codigoSeguridad) throws EmpleadoYaExistenteException {

		return concesionario.crearEmpleado(concesionario, adminActual, nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad);
	}

	/**
	 * Bloquea un empleado dado su usuario
	 * @param concesionario2
	 * @param adminActual
	 * @param usuario
	 * @throws EmpleadoNoRegistradoException
	 */
	public void bloquearEmpleado(Concesionario concesionario2, Administrador adminActual, String usuario) throws EmpleadoNoRegistradoException {
		concesionario.bloquearEmpleado(concesionario, adminActual, usuario);
	}

	/**
	 * Verifica que la fecha inicial sea menor a la fecha final
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 * @throws ParseException
	 */
	public boolean validarFechas(String fechaInicial, String fechaFinal) throws ParseException {
		boolean esValido = concesionario.validarFechas(fechaInicial, fechaFinal);
		return esValido;
	}

	/**
	 * Me da el arraylist con los datos para el tableView de los reportes
	 * @param fechaInicial
	 * @param fechaFinal
	 * @return
	 */
	public ArrayList<Transaccion> getListaDatosTransacciones(String fechaInicial, String fechaFinal) {
		ArrayList<Transaccion> listaDatosTransacciones = concesionario.getListaDatosTransacciones(fechaInicial, fechaFinal);
		return listaDatosTransacciones;
	}



}
