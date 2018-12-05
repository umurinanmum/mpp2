package book;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AuthorController{
	

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

}
