package book;

import java.util.ArrayList;

public class BookInfo {
	public BookInfo() {
		
	}
	
	private Integer id;

	public BookInfo(int allowedDays, String title, String isbn) {
		this.maxAllowedDays = allowedDays;
		this.setTitle(title);
		this.setIsbn(isbn);
	}
	
	public ArrayList<BookCopy> getCopies() {
		return copies;
	}
	public void setCopies(ArrayList<BookCopy> copies) {
		this.copies = copies;
	}
	
	public void addCopy(BookCopy copy) {
		this.copies.add(copy);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private int maxAllowedDays;
	private String title;
	private String isbn;

	private ArrayList<BookCopy> copies;
	private ArrayList<Author> authors;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getMaxAllowedDays() {
		return maxAllowedDays;
	}
	public void setMaxAllowedDays(int maxAllowedDays) {
		this.maxAllowedDays = maxAllowedDays;
	}
	
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	
}
