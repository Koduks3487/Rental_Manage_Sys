package OOP;
import java.util.*;

public class Request {
	private Book book;
	private TimePlace tp;
	private User writer;
	private String rqId;
	
	public Book getBook() {
		return this.book;
	}
	public TimePlace getTimeZone() {
		return this.tp;
	}
	public User getWriter() {
		return this.writer;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setTimePlace(TimePlace tp) {
		this.tp = tp;
	}
	public void setWriter(User user) {
		this.writer = user;
	}
	public String getId() {
		return this.rqId;
	}
}