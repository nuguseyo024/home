import java.util.Arrays;
import java.util.List;

public class C3_MapToInt2
{

	public static void main(String[] args)
	{
		List<String> ls = Arrays.asList("BOX", "Robot", "Simple");
		
		ls.stream()
		  .mapToInt(s -> s.length())  //ToInt 
		  .forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
	}
}
