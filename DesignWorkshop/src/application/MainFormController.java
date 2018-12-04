package application;

import DAL.DataAccessImpl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFormController  {
	
	@FXML
	protected void login_click(ActionEvent actionevent)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("./login.fxml"));
			Parent root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Add/Edit Member Form");
			stage.setScene(new Scene(root, 800, 500));
			//primaryStage.setScene(new Scene(root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void addEditBook_click(ActionEvent actionevent)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("./BookCopyUI.fxml"));
			Parent root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Add/Edit Member Form");
			stage.setScene(new Scene(root, 800, 500));
			//primaryStage.setScene(new Scene(root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void addEditMember_click(ActionEvent actionevent)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("./AddEditMember.fxml"));
			Parent root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Add/Edit Member Form");
			stage.setScene(new Scene(root, 800, 500));
			//primaryStage.setScene(new Scene(root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void checkoutBook_click(ActionEvent actionevent)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("./Checkout.fxml"));
			Parent root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Add/Edit Member Form");
			stage.setScene(new Scene(root, 800, 500));
			//primaryStage.setScene(new Scene(root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
