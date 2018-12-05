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
			Parent root = FXMLLoader.load(getClass().getResource("../book/BookUI.fxml"));
 
			primaryStage.setTitle("Address Form");
			primaryStage.setScene(new Scene(root, 800, 800));
	 
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
