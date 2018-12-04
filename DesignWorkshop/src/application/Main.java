package application;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../ui/login.fxml"));
			primaryStage.setTitle("Address Form");
			primaryStage.setScene(new Scene(root, 400, 300));
			
//			LoginController loginController = (LoginController)loader.getController();
//			loginController.setStageAndSetupListeners(primaryStage);
			//primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
