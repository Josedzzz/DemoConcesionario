package demoConcesionarioCarroUq.application;


import demoConcesionarioCarroUq.controllers.InicioSesionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
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




}
