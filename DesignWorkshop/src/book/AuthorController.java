package book;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AuthorController implements Initializable{
	
	public AuthorController() {
		
	}
	
	@FXML
	private ComboBox<String> authorsCombo;

	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField phone;

	@FXML
	private TextField bio;

	@FXML
	private TextField credentials;

	@FXML
	private TextField street;

	@FXML
	private TextField city;

	@FXML
	private TextField state;

	@FXML
	private TextField zip;

	@FXML
	protected void save(ActionEvent actionEvent) {

	}

	@FXML
	protected void cancel(ActionEvent actionEvent) {

	}
	
	@FXML
	protected void removeAuthor(ActionEvent actionEvent) {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		authorsCombo.setItems(FXCollections.observableArrayList());
		authorsCombo.getItems().add("umur");
		
	}

}
