package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class UserCreationController implements Initializable {
	@FXML
	private Pane userCreationPanel;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField surname;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField address;
	
		
	@FXML
	private ComboBox<String> roles;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> options = FXCollections.observableArrayList("ADMIN", "LIBRARIAN", "BOTH");
		roles = new ComboBox<>(options); 
	}
	
	
	
	
}
