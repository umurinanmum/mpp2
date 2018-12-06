package book;

import java.util.ArrayList;

public class BookInfo {
	private Integer id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public ArrayList<BookCopy> getCopies() {
		return copies;
	}
	public void setCopies(ArrayList<BookCopy> copies) {
		this.copies = copies;
	}
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	
}
