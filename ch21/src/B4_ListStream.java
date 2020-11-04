import java.util.Arrays;
import java.util.List;

public class B4_ListStream
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("TOy", "RObot", "Box");
		
		list.stream()	
			.forEach(s -> System.out.print(s+ "\t"));
			System.out.println();
	}
}
