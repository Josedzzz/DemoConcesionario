package demoConcesionarioCarroUq.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import demoConcesionarioCarroUq.application.Aplicacion;
import demoConcesionarioCarroUq.model.Administrador;
import demoConcesionarioCarroUq.model.Concesionario;
import demoConcesionarioCarroUq.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

public class InicioSesionController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtUsuarioAdminSesion;

    @FXML
    private TextField txtContraseniaAdminSesion;

    @FXML
    private Button btnIngresarEmpleadoSesion;

    @FXML
    private TextField txtContraseniaEmpleadoSesion;

    @FXML
    private TextField txtUsuarioEmpleadoSesion;

    @FXML
    private Button btnIngresarAdminSesion;

    @FXML
    private Button btnOlvidoAdminSesion;

    @FXML
    private Button btnOlvidoEmpleadoSesion;

    //Creo la aplicacion
    private Aplicacion aplicacion;

    //Creo el consecionario
    private Concesionario concesionario;

    //Creo las variables auxiliares para el empleado o el admin que inicien sesion
    private Empleado empleadoSesion;
    private Administrador administradorSesion;

    private Stage stage;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
	}

    public void show() {
 		stage.show();
 	}


    /**
     * Ingresar como admin
     * @param event
     * @throws IOException
     */
    @FXML
    void ingresarAdminSesion(ActionEvent event) throws IOException {
    	String usuario = txtUsuarioAdminSesion.getText();
    	String contrasenia = txtContraseniaAdminSesion.getText();
    	if(datosValidosAdminEmpleado(usuario, contrasenia)) {
    		administradorSesion = aplicacion.darAdministradorSesion(usuario, contrasenia);
    		if(administradorSesion == null) {
    			mostrarMensaje("Notificación Inicio Sesión", "No existe el administrador", "No hay un admin con esos "
    					+ "datos", AlertType.WARNING);
    		} else {
    			FXMLLoader loader = new FXMLLoader();
    			loader.setLocation(Aplicacion.class.getResource("../view/FuncionalidadAdministrador.fxml"));
    			AnchorPane anchorPane = (AnchorPane)loader.load();
    			FuncionalidadAdministradorController controller = loader.getController();
    			controller.setAplicacion(aplicacion);
    	    	Scene scene= new Scene(anchorPane);
    	    	Stage stage = new Stage();
    	    	stage.setTitle("Funcionalidad administrador");
    	   		stage.setScene(scene);
    	   		controller.init(stage, this, administradorSesion);
    	   		stage.show();
    	   		this.stage.close();
    		}
    	}
    }

	@FXML
    void recuperarAdminSesion(ActionEvent event) {

    }

	/**
	 * Ingresar como empleado
	 * @param event
	 */
    @FXML
    void ingresarEmpleadoSesion(ActionEvent event) {
    	String usuario = txtUsuarioEmpleadoSesion.getText();
    	String contrasenia = txtContraseniaEmpleadoSesion.getText();
    	if(datosValidosAdminEmpleado(usuario, contrasenia)) {
    		empleadoSesion = aplicacion.darEmpleadoSesion(usuario, contrasenia);
    		if(empleadoSesion == null) {
    			mostrarMensaje("Notificación Inicio Sesión", "No existe el empleado", "No hay un empleado con esos "
    					+ "datos", AlertType.WARNING);
    		} else {

    		}
    	}
    }

    @FXML
    void recuperarEmpleadoSesion(ActionEvent event) {

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

    /**
     * Me mira que los datos ingresados no esten vacios
     * @param usuario
     * @param contrasenia
     * @param credencial
     * @return
     */
	private boolean datosValidosAdminEmpleado(String usuario, String contrasenia) {
    	String notificacion = "";
    	if(usuario == null || usuario.equals("")) {
    		notificacion += "El usuario está en blanco\n";
    	}
    	if(contrasenia == null || contrasenia.equals("")) {
    		notificacion += "La contraseña está en blanco\n";
    	}
    	//Si no hay notificacion los datos son validos
    	if(notificacion.equals("")) {
    		return true;
    	}
    	//Notifica al usuario la info invalida
    	mostrarMensaje("Notificación Inicio Sesión", "Información del admin invalida", notificacion, AlertType.WARNING);
    	return false;
	}


}
