package OOP;
import java.util.*;

public class Rental {
	private Book book;
	private TimePlace tp;
	private User writer;
	private String rntl_id;
	private int status;
	
	public Book getBook() {
		return this.book;
	}
	public TimePlace getTimePlace() {
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
	public void setStat(int stat) {
		this.status = stat;
	}
	public int getStat() {
		return this.status;
	}
	public String getId() {
		return this.rntl_id;
	}
	public void getProfile() {
		
	}
}
