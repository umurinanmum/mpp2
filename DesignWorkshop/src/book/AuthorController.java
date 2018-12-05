package book;

import DAL.DataAccessFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import member.Address;

public class AuthorController {

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
		if (firstName.getText() == null || firstName.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "First name cannot be null or empty");
			alert.showAndWait();
		}
		if (lastName.getText() == null || lastName.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Last name cannot be null or empty");
			alert.showAndWait();
		} else {
			Author author = new Author();
			author.setFirstName(firstName.getText());
			author.setLastName(lastName.getText());
			author.setPhone(phone.getText());
			author.setBio(bio.getText());
			author.setCredentials(credentials.getText());
			author.setAddress(new Address());
			author.getAddress().setCity(city.getText());
			author.getAddress().setState(state.getText());
			author.getAddress().setStreet(street.getText());
			author.getAddress().setZip(zip.getText());

			boolean result = DataAccessFactory.getInstance().addAuthor(author);
			if (result) {
				Alert alert = new Alert(AlertType.INFORMATION,
						"Author has been created with the name " + author.getFirstName() + " " + author.getLastName());
				alert.showAndWait();
			}
		}

	}

	@FXML
	protected void cancel(ActionEvent actionEvent) {

	}

}
