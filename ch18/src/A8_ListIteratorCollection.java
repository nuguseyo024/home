import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A8_ListIteratorCollection
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Toy","Box","Robot","Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		String str;
		
		// 왼쪽 --> 오른쪽
		while(litr.hasNext()) 
		{
			str = litr.next();
			System.out.print(str + '\t');
			
			if(str.equals("Toy"))
				litr.add("Toy2");
		}
		System.out.println();
		
		// 오른쪽 --> 왼쪽
		while(litr.hasPrevious()) 
		{
			str = litr.previous();
			System.out.print(str + '\t');
			
			if(str.equals("Robot"))
				litr.add("Robot2");
		}
		System.out.println();
		
		// 다시 왼쪽 --> 오른쪽
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		

	}

}
