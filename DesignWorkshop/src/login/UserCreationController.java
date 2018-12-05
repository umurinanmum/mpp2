package login;

import java.net.URL;
import java.util.ResourceBundle;

import DAL.DataAccessFactory;
import employee.Role;
import employee.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import member.Address;

public class UserCreationController implements Initializable {
	@FXML
	private Pane userCreationPanel;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField surname;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField street;

	@FXML
	private TextField city;

	@FXML
	private TextField state;

	@FXML
	private TextField zip;
		
	@FXML
	private ComboBox<String> roles;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> options = FXCollections.observableArrayList("ADMIN", "LIBRARIAN", "BOTH");
		roles.setItems(options);
	}
	
	
	@FXML
	protected void okAction(ActionEvent actionevent)
	{
		User user = new User();
		user.setName(name.getText());
		user.setSurname(surname.getText());
		user.setUsername(username.getText());
		user.setPassword(password.getText());
		user.setRole(Role.valueOf(roles.getValue()));
		user.setAddress(new Address(street.getText(),city.getText(),state.getText(),zip.getText()));
		DataAccessFactory.getInstance().addUser(user);
		Alert alert = new Alert(AlertType.CONFIRMATION,"User is created");
		alert.show();
		this.state.getScene().getWindow().hide();
	}
	
	@FXML
	protected void cancelAction(ActionEvent actionevent)
	{
		this.state.getScene().getWindow().hide();
	}
	
	
}
