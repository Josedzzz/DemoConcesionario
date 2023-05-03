package demoConcesionarioCarroUq.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import demoConcesionarioCarroUq.application.Aplicacion;
import demoConcesionarioCarroUq.exceptions.EmpleadoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.EmpleadoYaExistenteException;
import demoConcesionarioCarroUq.model.Administrador;
import demoConcesionarioCarroUq.model.Concesionario;
import demoConcesionarioCarroUq.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FuncionalidadAdministradorController implements Initializable{


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Empleado, String> columnCorreoEmpleadoFuncionalidadA;

    @FXML
    private TextField txtNombreEmpleadoFuncionalidadA;

    @FXML
    private TextField txtContraseniaEmpleadoFuncionalidadA;

    @FXML
    private TextField txtCodigoEmpleadoFuncionalidadA;

    @FXML
    private TextField txtApellidosEmpleadoFuncionalidadA;

    @FXML
    private TextField txtIdentificacionEmpleadoFuncionalidadA;

    @FXML
    private TableView<Empleado> tableViewEmpleadosFuncionalidadA;

    @FXML
    private Button btnBloquearEmpleadoFuncionalidadA;

    @FXML
    private Button btnRegistarEmpleadoFuncionalidadA;

    @FXML
    private Button btnNuevoEmpleadoFuncionalidadA;

    @FXML
    private TextField txtUsuarioEmpleadoFuncionalidadA;

    @FXML
    private TableColumn<Empleado, String> columnNombreEmpleadoFuncionalidadA;

    @FXML
    private TableColumn<Empleado, String> columnUsuarioEmpleadoFuncionalidadA;

    @FXML
    private TextField txtCorreoEmpleadoFuncionalidadA;

    @FXML
    private Button btnActualizarEmpleadoFuncionalidadA;

    @FXML
    private TableColumn<Empleado, String> columnIdentificacionEmpleadoFuncionalidadA;

    @FXML
    private TableColumn<Empleado, String> columnApellidoEmpleadoFuncionalidadA;

    @FXML
    private TableColumn<Empleado, Boolean> columnActivoEmpleadoFuncionalidadA;

    @FXML
    private Button btnCerrarSesionFuncionalidadA;


    //Creo la lista de empleados que se encuentra en el tableView
    ObservableList<Empleado> listadoEmpleados = FXCollections.observableArrayList();
    //Creo el empleado que el usuario puede seleccionar
    private Empleado empleadoSeleccion;

    //Declaro variables necesarias

    private Administrador adminActual;

    private Stage stage;

    private Aplicacion aplicacion;

    private InicioSesionController inicioSesionController;

    private Concesionario concesionario;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Datos en la tableView de empleados
		this.columnNombreEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("nombres"));
		this.columnApellidoEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
		this.columnIdentificacionEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columnUsuarioEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("usuario"));
		this.columnCorreoEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("correo"));
		this.columnActivoEmpleadoFuncionalidadA.setCellValueFactory(new PropertyValueFactory<>("cuentaActiva"));
		//Para poder seleccionar un empleado de la tabla
		tableViewEmpleadosFuncionalidadA.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			if(newSelection != null) {
				empleadoSeleccion = newSelection;
				mostrarInformacionEmpleado();
			}
		});
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion= aplicacion;
		this.concesionario = aplicacion.getConcesionario();
		//Lista de empleados que se va a mostrar
		tableViewEmpleadosFuncionalidadA.getItems().clear();
		tableViewEmpleadosFuncionalidadA.setItems(getEmpleados());
	}

    private ObservableList<Empleado> getEmpleados() {
		listadoEmpleados.addAll(concesionario.getListaEmpleados());
		return listadoEmpleados;
	}

    /**
     * Para volver a la ventana inicial (InicioSesion)
     * @param event
     */
	@FXML
    void cerrarSesion(ActionEvent event) {
    	this.stage.close(); //Cierro esta ventana
    	inicioSesionController.show(); //Muestro la ventana de login
    }

	/**
	 * Cuando el admin inicia sesion se completan estos datos
	 * @param stage
	 * @param inicioSesionController
	 * @param adminActual
	 */
	public void init(Stage stage, InicioSesionController inicioSesionController, Administrador adminActual) {
		this.inicioSesionController = inicioSesionController;
		this.concesionario = aplicacion.getConcesionario();
		this.adminActual = adminActual;
		this.stage = stage;
	}

	/**
	 * Muestra los datos del empleado seleccionado
	 */
    private void mostrarInformacionEmpleado() {
    	if(empleadoSeleccion != null) {
    		txtNombreEmpleadoFuncionalidadA.setText(empleadoSeleccion.getNombres());
    		txtApellidosEmpleadoFuncionalidadA.setText(empleadoSeleccion.getApellidos());
    		txtIdentificacionEmpleadoFuncionalidadA.setText(empleadoSeleccion.getIdentificacion());
    		txtUsuarioEmpleadoFuncionalidadA.setText(empleadoSeleccion.getUsuario());
    		txtContraseniaEmpleadoFuncionalidadA.setText(empleadoSeleccion.getContrasenia());
    		txtCorreoEmpleadoFuncionalidadA.setText(empleadoSeleccion.getCorreo());
    		txtCodigoEmpleadoFuncionalidadA.setText(empleadoSeleccion.getCodigoSeguridad());
    		//Deshabilito algunos campos que no se pueden modificar
    		txtUsuarioEmpleadoFuncionalidadA.setDisable(true);
    		txtContraseniaEmpleadoFuncionalidadA.setDisable(true);
    		txtCodigoEmpleadoFuncionalidadA.setDisable(true);
    	}
	}

    /**
     * Setea los datos vacios para crear un empleado
     * @param event
     */
    @FXML
    void nuevoEmpleado(ActionEvent event) {
		txtNombreEmpleadoFuncionalidadA.setText("");
		txtApellidosEmpleadoFuncionalidadA.setText("");
		txtIdentificacionEmpleadoFuncionalidadA.setText("");
		txtUsuarioEmpleadoFuncionalidadA.setText("");
		txtCorreoEmpleadoFuncionalidadA.setText("");
		empleadoSeleccion = null;
		//Habilito algunos campos que no se pueden modificar
		txtUsuarioEmpleadoFuncionalidadA.setDisable(false);
		txtContraseniaEmpleadoFuncionalidadA.setDisable(false);
		txtCodigoEmpleadoFuncionalidadA.setDisable(false);
    }

    /**
     * Actualiza los datos de un empleado seleccionado (usuario, contrasenia y codigoSeguridad)
     * @param event
     * @throws EmpleadoNoRegistradoException
     */
    @FXML
    void actualziarEmpleado(ActionEvent event) throws EmpleadoNoRegistradoException {
    	String nombre = txtNombreEmpleadoFuncionalidadA.getText();
    	String apellido = txtApellidosEmpleadoFuncionalidadA.getText();
    	String identificacion = txtIdentificacionEmpleadoFuncionalidadA.getText();
    	String usuario = txtUsuarioEmpleadoFuncionalidadA.getText();
    	String contrasenia = txtContraseniaEmpleadoFuncionalidadA.getText();
    	String correo = txtCorreoEmpleadoFuncionalidadA.getText();
    	String codigoSeguridad = txtCodigoEmpleadoFuncionalidadA.getText();
    	if(empleadoSeleccion != null) {
    		if(datosValidosEmpleado(nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad)) {
    			aplicacion.actualizarEmpleado(concesionario, adminActual, nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad);
    			//Actualizo los datos de la interfaz
    			empleadoSeleccion.setNombres(nombre);
    			empleadoSeleccion.setApellidos(apellido);
    			empleadoSeleccion.setIdentificacion(identificacion);
    			empleadoSeleccion.setCorreo(correo);
    			//Actualizo los datos de la tabla
    			tableViewEmpleadosFuncionalidadA.refresh();
    			mostrarMensaje("Notificaci�n Concesionario", "Empleado actualizado", "El empleado "
    					+ usuario + " ha sido actualizado", AlertType.INFORMATION);
    		}
    	} else {
    		mostrarMensaje("Notificaci�n Concesionario", "Empleado no seleccionado", "No se ha seleccionado "
    				+ "ning�n empleado", AlertType.WARNING);
    	}
    }

    /**
     * Verifica que los datos del empleado no esten vacios
     * @param nombre
     * @param apellido
     * @param identificacion
     * @param usuario
     * @param contrasenia
     * @param correo
     * @param codigoSeguridad
     * @return
     */
    private boolean datosValidosEmpleado(String nombre, String apellido, String identificacion, String usuario,
			String contrasenia, String correo, String codigoSeguridad) {
    	String notificacion = "";
    	if(nombre == null || nombre.equals("")) {
    		notificacion += "El nombre es invalido\n";
    	}
    	if(apellido == null || apellido.equals("")) {
    		notificacion += "El apellido es inavalido\n";
    	}
    	if(identificacion == null || identificacion.equals("")) {
    		notificacion += "La identificaci�n es invalida\n";
    	}
    	if(usuario == null || usuario.equals("")) {
    		notificacion += "El usuario es invalido\n";
    	}
    	if(contrasenia == null || contrasenia.equals("")) {
    		notificacion += "La contrase�a es invalida\n";
    	}
    	if(correo == null || correo.equals("")) {
    		notificacion += "El correo es invalido\n";
    	}
    	if(codigoSeguridad == null || codigoSeguridad.equals("")) {
    		notificacion += "El codigo de seguridad es invalido\n";
    	}
    	//Si no hay notificacion los datos son validos
    	if(notificacion.equals("")) {
    		return true;
    	}
    	mostrarMensaje("Notificaci�n Concesionario", "Informaci�n del empleado invalida", notificacion, AlertType.WARNING);
    	return false;
	}

    /**
     * Registra un empleado si los datos son validos (llama a crear empleado)
     * @param event
     * @throws EmpleadoYaExistenteException
     */
	@FXML
    void registrarEmpleado(ActionEvent event) throws EmpleadoYaExistenteException {
    	String nombre = txtNombreEmpleadoFuncionalidadA.getText();
    	String apellido = txtApellidosEmpleadoFuncionalidadA.getText();
    	String identificacion = txtIdentificacionEmpleadoFuncionalidadA.getText();
    	String usuario = txtUsuarioEmpleadoFuncionalidadA.getText();
    	String contrasenia = txtContraseniaEmpleadoFuncionalidadA.getText();
    	String correo = txtCorreoEmpleadoFuncionalidadA.getText();
    	String codigoSeguridad = txtCodigoEmpleadoFuncionalidadA.getText();
    	if(datosValidosEmpleado(nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad)) {
    		crearEmpleado(nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad);
    	}
    }

	/**
	 * Crea un empleado con los datos siempre y cuando el nombre de usuario no est� repetido
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param usuario
	 * @param contrasenia
	 * @param correo
	 * @param codigoSeguridad
	 */
    private void crearEmpleado(String nombre, String apellido, String identificacion, String usuario,
			String contrasenia, String correo, String codigoSeguridad) {

    	boolean fueCreado;
		try {
			fueCreado = aplicacion.crearEmpleado(concesionario, adminActual, nombre, apellido, identificacion, usuario, contrasenia, correo, codigoSeguridad);
		   	if(fueCreado) {
	    		//A�ado el empleado a l atable view
	    		tableViewEmpleadosFuncionalidadA.getItems().clear();
	    		tableViewEmpleadosFuncionalidadA.setItems(getEmpleados());
	    		mostrarMensaje("Notificaci�n Concesionario", "Empleado registrado", "El empleado " + usuario +
	    				" ha sido registrado", AlertType.INFORMATION);
		   	}
		} catch (EmpleadoYaExistenteException e) {
	   		mostrarMensaje("Notificaci�n Concesionario", "Empleado no registrado", "El empleado " + usuario +
    				" ya existe", AlertType.WARNING);
		}
	}

    /**
     * Bloquea la cuenta un empleado seleccionado
     * @param event
     */
	@FXML
    void bloquearEmpleado(ActionEvent event) {
		if(empleadoSeleccion != null) {
	    	String usuario = txtUsuarioEmpleadoFuncionalidadA.getText();
	    	try {
				aplicacion.bloquearEmpleado(concesionario, adminActual, usuario);
				//Actualizo los datos de la tabla
				tableViewEmpleadosFuncionalidadA.refresh();
				mostrarMensaje("Notificaci�n Concesionario", "Empleado bloqueado", "El empleado "
						+ usuario + " ha sido bloqueado", AlertType.INFORMATION);
			} catch (EmpleadoNoRegistradoException e) {
				mostrarMensaje("Notificaci�n Concesionario", "Empleado bloqueado", "El empleado "
						+ usuario + " no ha podido ser bloqueado", AlertType.WARNING);
			}
		} else {
			mostrarMensaje("Notificaci�n Concesionario", "Empleado no seleccionado", "No se ha seleccionado "
					+ "ning�n empleado", AlertType.WARNING);
    	}
    }

    /**
     * Muestra un mensaje dependiendo con el tipo de alerta seleccionado
     * @param title
     * @param header
     * @param content
     * @param alertType
     */
    public void mostrarMensaje(String title, String header, String content, AlertType alertType) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.showAndWait();
    }



}