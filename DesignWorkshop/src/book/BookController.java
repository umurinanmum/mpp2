package book;

import java.net.URL;
import java.util.ResourceBundle;

import DAL.DataAccessFactory;
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
		if (item != null) {
			authorList.getItems().remove(item);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		populateBookCombo();
		populateAuthorCombo();

		authorCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {

			if (newVal != null) {
				authorList.getItems().add(newVal);
			}

		});

		bookCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {

			if (newVal != null) {
				// set the fields
				BookInfo selectedBook = DataAccessFactory.getInstance().getBookInfoByName(newVal);
				if (selectedBook != null) {
					title.setText(selectedBook.getTitle());
					isbn.setText(selectedBook.getIsbn());
					maxAllowedDays.setText(selectedBook.getMaxAllowedDays() + "");
					authorList.getItems().clear();
					if (selectedBook.getAuthors() != null) {
						for (int i = 0; i < selectedBook.getAuthors().size(); i++) {
							authorList.getItems().add(selectedBook.getAuthors().get(i).getFirstName() + " "
									+ authorList.getItems().add(selectedBook.getAuthors().get(i).getLastName()));
						}
					}
				}
			}

		});

	}

	private void populateAuthorCombo() {
		authorCombo.setItems(FXCollections.observableArrayList());
		for (int i = 0; i < DataAccessFactory.getInstance().getAllAuthors().size(); i++) {
			authorCombo.getItems().add(DataAccessFactory.getInstance().getAllAuthors().get(i).getFirstName() + " "
					+ DataAccessFactory.getInstance().getAllAuthors().get(i).getLastName());
		}

	}

	private void populateBookCombo() {
		bookCombo.setItems(FXCollections.observableArrayList());
		for (int i = 0; i < DataAccessFactory.getInstance().getAllBooks().size(); i++) {
			bookCombo.getItems().add(DataAccessFactory.getInstance().getAllBooks().get(i).getTitle());
		}
	}
}
