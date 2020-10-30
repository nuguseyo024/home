class Book2
{
	private String title;
	public Book2() {}
	public Book2(String title) {this.title = title;}
	public void setTitle(String title) {this.title = title;}
	public String toString() {return title;}
}

public class G2_NewInstanceTest

{
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{	
		Book2 myBook1 = new Book2("홍길동쓰");
		System.out.println(myBook1);
		
		Class pClass = Class.forName("Book2");
		Book2 myBook2 = (Book2)pClass.newInstance();
		myBook2.setTitle("전우치쓰");
		System.out.println(myBook2);
		
	}

}
