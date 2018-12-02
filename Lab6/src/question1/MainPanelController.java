package question1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainPanelController {

	@FXML
	private TextField name;
	@FXML
	private TextField street;
	@FXML
	private TextField city;
	@FXML
	private TextField state;
	@FXML
	private TextField zip;

	@FXML
	protected void submit(ActionEvent actionEvent) {
		System.out.println(name.getText());
		System.out.println(street.getText());
		System.out.println(city.getText() + ", " + state.getText() + " " + zip.getText());
	}

}
