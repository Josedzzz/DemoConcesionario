package demoConcesionarioCarroUq.application;

import java.text.ParseException;
import java.util.ArrayList;

import demoConcesionarioCarroUq.controllers.InicioSesionController;
import demoConcesionarioCarroUq.exceptions.EmpleadoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.EmpleadoYaExistenteException;
import demoConcesionarioCarroUq.model.Administrador;
import demoConcesionarioCarroUq.model.Concesionario;
import demoConcesionarioCarroUq.model.Empleado;
import demoConcesionarioCarroUq.model.Transaccion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	private Stage primaryStage;
	private Concesionario concesionario;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.concesionario = new Concesionario("Concesionario Carro Uq");
		mostrarVentanaPrincipal();
	}

	private void mostrarVentanaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/demoConcesionarioCarroUq/view/InicioSesionView.fxml"));
			AnchorPane anchorPane = (AnchorPane)loader.load();
			InicioSesionController inicioSesionController = loader.getController();
			inicioSesionController.setAplicacion(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
			InicioSesionController controller = loader.getController();
			controller.setStage(primaryStage);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
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
