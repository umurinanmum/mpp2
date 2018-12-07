package book;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAL.DataAccessFactory;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
	protected ListView<String> copyBooks ;
	

	@FXML
	protected void save(ActionEvent actionEvent) {
		if (authorList.getItems() == null || authorList.getItems().size() == 0) {
			Alert alert = new Alert(AlertType.ERROR, "Book must have at least 1 author");
			alert.showAndWait();
		}
		if (title.getText() == null || title.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Title cannot be null or empty");
			alert.showAndWait();
		}

		if (isbn.getText() == null || isbn.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Isbn cannot be null or empty");
			alert.showAndWait();
		} else {
			BookInfo bookInfo = new BookInfo();
			bookInfo.setIsbn(isbn.getText());
			bookInfo.setTitle(title.getText());
			int maxAllowedDaysInt = 0;
			try {
				maxAllowedDaysInt = Integer.parseInt(maxAllowedDays.getText());
			} catch (Exception e) {
				Alert alert = new Alert(AlertType.ERROR, "Max Allowed Days Must Be Integer");
				alert.showAndWait();
			}
			bookInfo.setMaxAllowedDays(maxAllowedDaysInt);
			bookInfo.setAuthors(new ArrayList<>());
			for (int i = 0; i < authorList.getItems().size(); i++) {
				bookInfo.getAuthors().add(DataAccessFactory.getInstance().getAuthorByName(
						authorList.getItems().get(i).split(" ")[0], authorList.getItems().get(i).split(" ")[1]));
			}

			boolean result = DataAccessFactory.getInstance().addBookInfo(bookInfo);
			if (result) {
				Alert alert = new Alert(AlertType.INFORMATION,
						"Book has been created with the title " + bookInfo.getTitle());
				alert.showAndWait();

				if (bookCombo.getItems() == null) {
					bookCombo.setItems(FXCollections.observableArrayList());
				}

				bookCombo.getItems().add(bookInfo.getTitle());

			}

		}
	}

	@FXML
	protected void cancel(ActionEvent actionEvent) {

	}

	@FXML
	protected void updateBook(ActionEvent actionEvent) {
		if (authorList.getItems() == null || authorList.getItems().size() == 0) {
			Alert alert = new Alert(AlertType.ERROR, "Book must have at least 1 author");
			alert.showAndWait();
		}
		if (title.getText() == null || title.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Title cannot be null or empty");
			alert.showAndWait();
		}

		if (isbn.getText() == null || isbn.getText().trim().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR, "Isbn cannot be null or empty");
			alert.showAndWait();
		} else {
			BookInfo bookInfo = new BookInfo();
			bookInfo.setIsbn(isbn.getText());
			bookInfo.setTitle(title.getText());
			int maxAllowedDaysInt = 0;
			try {
				maxAllowedDaysInt = Integer.parseInt(maxAllowedDays.getText());
			} catch (Exception e) {
				Alert alert = new Alert(AlertType.ERROR, "Max Allowed Days Must Be Integer");
				alert.showAndWait();
			}
			bookInfo.setMaxAllowedDays(maxAllowedDaysInt);
			bookInfo.setAuthors(new ArrayList<>());
			for (int i = 0; i < authorList.getItems().size(); i++) {
				bookInfo.getAuthors().add(DataAccessFactory.getInstance().getAuthorByName(
						authorList.getItems().get(i).split(" ")[0], authorList.getItems().get(i).split(" ")[1]));
			}

			boolean result = DataAccessFactory.getInstance().updateBookInfo(bookInfo);
			if (result) {
				Alert alert = new Alert(AlertType.INFORMATION, "Book has been updated ");
				alert.showAndWait();

			}
		}
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
			authorList.getItems().clear();
			if (newVal != null) {
				authorList.getItems().add(newVal);
			}

		});

		bookCombo.valueProperty().addListener((ChangeListener<String>) (value, old, newVal) -> {

			if (newVal != null) {
				// set the fields
				BookInfo selectedBook = DataAccessFactory.getInstance().getBookInfoByName(newVal);
				if (selectedBook != null) {
					copyBooks.getItems().clear();
					if(selectedBook.getCopies()!= null) {
						for (int i = 0; i < selectedBook.getCopies().size(); i++) {
							copyBooks.getItems().add(selectedBook.getCopies().get(i).getUid());
						}
					}
					
					
					title.setText(selectedBook.getTitle());
					isbn.setText(selectedBook.getIsbn());
					maxAllowedDays.setText(selectedBook.getMaxAllowedDays() + "");
					authorList.getItems().clear();
					if (selectedBook.getAuthors() != null) {
						for (int i = 0; i < selectedBook.getAuthors().size(); i++) {
							authorList.getItems().add(selectedBook.getAuthors().get(i).getFirstName() + " "
									+ selectedBook.getAuthors().get(i).getLastName());
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
