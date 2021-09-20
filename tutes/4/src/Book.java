
import java.util.Scanner;

public class Book implements IInput,IDisplay{
	private int bookID;
	private String title;
	private String publisher;
	
	public Book(int bookID , String title , String publisher) {
		this.bookID = bookID;
		this.title = title;
		this.publisher = publisher;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(bookID + " - " + title + " - " + publisher);
		
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Book ID   : " + bookID);
		System.out.println("Title     : " + title);
		System.out.println("Publisher : " + publisher);
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the book ID        : ");
		this.bookID = ob.nextInt();
		System.out.print("Enter the book title     : ");
		this.title = ob.next();
		System.out.print("Enter the book publisher : ");
		this.publisher = ob.next();
		
	}
	
	
}
