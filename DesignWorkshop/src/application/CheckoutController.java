package application;

import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

import DAL.*;
import book.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import member.*;

public class CheckoutController implements Initializable {
	@FXML
	private ComboBox cbMembers;
	@FXML
	private ComboBox cbBooks;
	@FXML
	private ComboBox cbBookCopies;
	 
	
	private DataAccessImpl<Integer, BookInfo> booksList = new DataAccessImpl<Integer, BookInfo>();
	
	private DataAccessImpl<Integer, Member> membersList = new DataAccessImpl<Integer, Member>();
	
	
	@FXML
	protected void checkoutBook(ActionEvent actionEvent) {
		System.out.println("Checkout clicked");
		
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
