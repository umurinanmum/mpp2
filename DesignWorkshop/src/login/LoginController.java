package controller;

import java.util.HashMap;
import java.util.Map;

import DAL.DataAccess;
import DAL.DataAccessFactory;
import employee.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LoginController {
	
	@FXML
	private Pane loginPanel;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	protected void okAction(ActionEvent actionEvent) {
		HashMap<Integer, User> userList = (HashMap<Integer, User>) DataAccessFactory.getInstance().getUserDB().getDB();
		for(User user: userList.values()) {
			if(user.getUsername().equals(username.getText()) && 
			   user.getPassword().equals(password.getText())) {
				loginPanel.getScene().getWindow().hide();
			}	
		}
	}
	
	@FXML
	protected void cancelAction(ActionEvent actionEvent) {
		
		loginPanel.getScene().getWindow().hide();
	}

	

}
