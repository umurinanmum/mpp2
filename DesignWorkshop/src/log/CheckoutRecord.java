package log;

import java.util.Date;

import book.BookCopy;
import employee.User;
import member.Member;

public class CheckoutRecord {

	public CheckoutRecord() {
		
	}
	public CheckoutRecord(Date checkoutDate, Date dueDate, Member member, BookCopy copy) {
		this.checkedoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.member = member;
		this.bookCopy = copy;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private Date checkedoutDate;
	private Date dueDate;
	private Member member;
	private BookCopy bookCopy;
	private User librarian;
	
}
