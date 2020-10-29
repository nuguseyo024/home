class Book
{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle)
	{
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public String toString()
	{
		return bookTitle + ", " + bookNumber;
	}
}
public class B3_ToString
{
	public static void main(String[] args)
	{
		Book book1 = new Book(200, "자바의 기초");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
