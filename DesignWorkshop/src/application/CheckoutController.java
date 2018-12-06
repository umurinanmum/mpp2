package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import DAL.*;
import log.*;
import book.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;
import javafx.util.StringConverter;
import member.*;

public class CheckoutController implements Initializable {
	@FXML
	private ComboBox cbMembers;
	@FXML
	private ComboBox<Member> cbLibMembers;
	@FXML
	private ComboBox<BookInfo> cbBooks;
	@FXML
	private ComboBox<BookCopy> cbBookCopies;
	 
	DataAccessFactory db = DataAccessFactory.getInstance();
	
	private ArrayList<Member> membersList = new ArrayList<Member>();
	private ArrayList<BookInfo> booksList = new ArrayList<BookInfo>();
	private ArrayList<BookCopy> booksCopyList = new ArrayList<BookCopy>();
	
	@FXML
	protected void checkoutBook(ActionEvent actionEvent) {
		Date dueDate = new Date();
		dueDate.setMonth((dueDate.getMonth()+1) % 13);
		Member member = this.cbLibMembers.getValue();
		BookCopy copy = this.cbBookCopies.getValue();
		CheckoutRecord r = new CheckoutRecord(new Date(), dueDate, member, copy);
		db.addCheckoutRecord(r);
		System.out.println("New Checkout Record Added.");
		System.out.println("Book Name: " + copy.getUid());
		System.out.println("Member: " + member.getName());
		
		Alert alert = new Alert(AlertType.INFORMATION,"Checkout record added successfully");
		alert.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		for(int i = 0;i<10;i++) {
			Member newMember = new Member("fName #" + i, "lName #"+ i);
			membersList.add(newMember);
			db.addMember(newMember);
			
			BookInfo book = new BookInfo(30, "Book #" + (i+1), "123456"+i);
			booksList.add(book);
			
			for(int j = 0; j< 5;j++) {
				booksCopyList.add(new BookCopy("Book #" + (i+1) + " - Copy #" + (i+1), true, book));
			}
			//this.cbMembers.add(new ComboBox(newMember.getId(), newMember.getName()));
		}
		
		this.cbLibMembers.setItems(FXCollections.observableArrayList(membersList));
		this.cbLibMembers.setConverter(new StringConverter<Member>() {
		    @Override
		    public String toString(Member object) {
		        return object.getName();
		    }

		    @Override
		    public Member fromString(String string) {
		        return null;
		    }
		});
		
		this.cbBooks.setItems(FXCollections.observableArrayList(booksList));
		this.cbBooks.setConverter(new StringConverter<BookInfo>() {
		    @Override
		    public String toString(BookInfo object) {
		        return object.getTitle();
		    }

		    @Override
		    public BookInfo fromString(String string) {
		        return null;
		    }
		});
		this.cbBooks.valueProperty().addListener((obs, oldVal, newVal) -> {
            //String selectionText = "Price of the " + newVal.getName() + " is : " + newVal.getPrice();
			List<BookCopy> reducedList = this.booksCopyList.stream()
					  .filter((copy) -> copy.getBook() == newVal)
					  .collect(Collectors.toList());
					  //.toArray<BookCopy>();
			this.cbBookCopies.setItems(FXCollections.observableArrayList(reducedList));
		});

		

		this.cbBookCopies.setItems(FXCollections.observableArrayList(booksCopyList));
		this.cbBookCopies.setConverter(new StringConverter<BookCopy>() {
		    @Override
		    public String toString(BookCopy object) {
		        return object.getUid();
		    }

		    @Override
		    public BookCopy fromString(String string) {
		        return null;
		    }
		});
		
	}
}
