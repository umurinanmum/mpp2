package book;

public class BookCopy {
	public BookCopy(String uid, boolean isAvailable) {
		this.setUid(uid);
		this.isAvailable = isAvailable;
	}

	public BookCopy(String uid, boolean isAvailable, BookInfo book) {
		this(uid, isAvailable);
		this.setBook(book);
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public BookInfo getBook() {
		return book;
	}

	public void setBook(BookInfo book) {
		this.book = book;
	}

	private String uid;
	private boolean isAvailable;
	private BookInfo book;

}
