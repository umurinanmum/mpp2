package DAL;

import book.Author;
import book.BookInfo;
import employee.User;
import member.Member;

public class DataAccessFactory {
	private int userId = 0;
	private int bookId = 0;
	private int memberId = 0;
	private int authorId = 0;
	private final DataAccess<Integer, User> userDB = new DataAccessImpl<Integer, User>();
	private final DataAccess<Integer, BookInfo> bookDB = new DataAccessImpl<Integer, BookInfo>();
	private final DataAccess<Integer, Member> memberDB = new DataAccessImpl<Integer, Member>();
	private final DataAccess<Integer, Author> authorDB = new DataAccessImpl<Integer, Author>();
	private static DataAccessFactory instance;
	
	private DataAccessFactory() {}
	
	public static DataAccessFactory getInstance() {
		if(instance == null)
			instance = new DataAccessFactory();
		return instance;
	}
	
	//Add
	public boolean addUser(User user) {
		for(User userVal:userDB.getDB().values()) {
			if(user.getUsername().equals(userVal.getUsername()))
				return false;
		}
		user.setId(userId);
		userDB.add(userId, user);
		userId++;
		return true;
	}
	
	public boolean addBookInfo(BookInfo bookInfo) {
		for(BookInfo bookVal:bookDB.getDB().values()) {
			if(bookInfo.getTitle().equals(bookVal.getTitle()))
				return false;
		}
		bookInfo.setId(bookId);
		bookDB.add(bookId, bookInfo);
		bookId++;
		return true;	
	}

	public boolean addMember(Member member) {
		for(Member memberVal:memberDB.getDB().values()) {
			if(member.getName().equals(memberVal.getName()))
				return false;
		}
		member.setId(memberId);
		memberDB.add(memberId, member);
		memberId++;
		return true;
	}
	
	public boolean addAuthor(Author author) {
		for(Author authorVal:authorDB.getDB().values()) {
			if(author.getFirstName().equals(authorVal.getFirstName()) && 
			   author.getLastName().equals(authorVal.getLastName()))
				return false;
		}
		author.setId(authorId);
		authorDB.add(authorId, author);
		authorId++;
		return true;
	}
	
	//Update
	public boolean updateUser(User user) {
		for(User userVal:userDB.getDB().values()) {
			if(user.getUsername().equals(userVal.getUsername()))
				return false;
		}
		userDB.add(user.getId(),user);
		return true;
	}
	
	public boolean updateBookInfo(BookInfo bookInfo) {
		for(BookInfo bookVal:bookDB.getDB().values()) {
			if(bookInfo.getTitle().equals(bookVal.getTitle()))
				return false;
		}
		bookDB.add(bookInfo.getId(), bookInfo);
		return true;
	}

	public boolean updateMember(Member member) {
		for(Member memberVal:memberDB.getDB().values()) {
			if(member.getName().equals(memberVal.getName()))
				return false;
		}
		memberDB.add(member.getId(),member);
		return true;
	}
	
	public boolean updateAuthor(Author author) {
		for(Author authorVal:authorDB.getDB().values()) {
			if(author.getFirstName().equals(authorVal.getFirstName()) && 
			   author.getLastName().equals(authorVal.getLastName()))
				return false;
		}
		authorDB.add(author.getId(), author);
		return true;
	}
	
	public DataAccess<Integer, User> getUserDB() {
		return userDB;
	}
	
	public DataAccess<Integer, BookInfo> getBookDB() {
		return bookDB;
	}
	
	public DataAccess<Integer, Member> getMemberDB() {
		return memberDB;
	}
	
	public DataAccess<Integer, Author> getAuthorDB() {
		return authorDB;
	}
	
	//Getters
	public BookInfo getBookInfoByName(String bookName) {
		for(BookInfo bookVal:bookDB.getDB().values()) {
			if(bookName.equals(bookVal.getTitle()))
				return bookVal;
		}
		return null;
	}
	
	public User getUserById(int id) {
		return userDB.get(id);
	}
		
	public Member getMemberById(int id) {
		return memberDB.get(id);
	}
	
	public Author getAuthorById(int id) {
		return authorDB.get(id);
	}
	
}
