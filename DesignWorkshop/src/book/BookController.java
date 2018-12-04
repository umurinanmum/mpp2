package book;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class BookController implements Initializable {

	protected ObservableList<String> allAuthors;

	public BookController() {
		allAuthors = FXCollections.observableArrayList();
		// populate the authors
		allAuthors.add("test");
		allAuthors.add("test2");
		allAuthors.add("test3");
	}

	@FXML
	private ComboBox<String> authorCombo;

	@FXML
	private TextField title;

	@FXML
	private TextField isbn;

	@FXML
	private TextField maxAllowedDays;

	@FXML
	protected ListView<String> authorList = new ListView<String>();

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
		authorCombo.setItems(allAuthors);

		authorCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {
			authorList.getItems().add(newVal);
			//removeFromList(newVal);
		});
	}
	
	private void removeFromList(String val) {
		for (int i = 0; i < allAuthors.size(); i++) {
			if(allAuthors.get(i).equals(val)) {
				allAuthors.remove(i);
				break;
			}
		}
	}
}
