package DAL;

import book.Author;
import book.BookInfo;
import employee.User;
import member.Member;

public class DataAccessFactory {
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
	
}
