package book;

import java.net.URL; 
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
	private ComboBox<String> bookCombo;

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
	protected void updateBook(ActionEvent actionEvent) {

	}

	@FXML
	protected void removeAuthor(ActionEvent actionEvent) {
		String item = authorList.getSelectionModel().getSelectedItem();
		if(item != null) {
			authorList.getItems().remove(item);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		authorCombo.setItems(allAuthors);
		populateBookCombo();

		authorCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {

			if (newVal != null) {
				authorList.getItems().add(newVal);
			}

		});
		
		
		bookCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {

			if (newVal != null) {
				// set the fields
			}

		});
		
	}
	
	private void populateBookCombo() {
		bookCombo.setItems(FXCollections.observableArrayList());
		bookCombo.getItems().add("Test Book");
	}
}
