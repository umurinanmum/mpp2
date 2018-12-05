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
<<<<<<< HEAD
			Parent root = FXMLLoader.load(getClass().getResource("../book/BookUI.fxml"));
=======
			Parent root = FXMLLoader.load(getClass().getResource("../ui/login.fxml"));
>>>>>>> 4f390096b6d567ed8ff3ed74fe344ba3ebc60c0c
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
