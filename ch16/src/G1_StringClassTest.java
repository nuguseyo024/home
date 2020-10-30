import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Book 
{
	private String title;
	public String author;
	
	public Book(String title) {this.title = title;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
}
public class G1_StringClassTest
{
	public static void main(String[] args) 
	throws ClassNotFoundException
	{
		Class strClass = Class.forName("Book");
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons)
		{
			System.out.println(c);
		}
		System.out.println(":---|----------=---------------<");
		Field[] fields = strClass.getFields();
		for(Field f : fields)
		{System.out.println(f);}
		System.out.println(":---|----------=---------------<");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {System.out.println(m);}
	}

}
