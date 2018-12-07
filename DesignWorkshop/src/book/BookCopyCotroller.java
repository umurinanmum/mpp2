package book;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAL.DataAccessFactory;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BookCopyCotroller implements Initializable {

	@FXML
	private ComboBox<String> bookCombo;

	@FXML
	private TextField uid;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		populateBookCombo();
	}

	@FXML
	protected void save(ActionEvent actionEvent) {
		if (uid.getText() == null || uid.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Uid cannot be null or empty");
			alert.showAndWait();
		} else {
			BookInfo book = DataAccessFactory.getInstance()
					.getBookInfoByName(bookCombo.getSelectionModel().getSelectedItem());
			if (book.getCopies() == null) {
				book.setCopies(new ArrayList<>());
			}
			BookCopy bookCopy = new BookCopy(uid.getText(), true);
			book.getCopies().add(bookCopy);

			boolean result = DataAccessFactory.getInstance().updateBookInfo(book);
			if (result) {
				Alert alert = new Alert(AlertType.INFORMATION, "Book Copy has been created");
				alert.showAndWait();
			}
		}

	}
	
	private void populateBookCombo() {
		bookCombo.setItems(FXCollections.observableArrayList());
		for (int i = 0; i < DataAccessFactory.getInstance().getAllBooks().size(); i++) {
			bookCombo.getItems().add(DataAccessFactory.getInstance().getAllBooks().get(i).getTitle());
		}
	}
}
