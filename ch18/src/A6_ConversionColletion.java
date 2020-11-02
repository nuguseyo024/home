import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A6_ConversionColletion
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Toy","Box","Robot","Box");
		list = new ArrayList<>(list);
		
		//ArrayList<E> 인스턴스의 순환
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		// ArrayList<E>를 LinkedList<E>로 변환
		list = new LinkedList<>(list);
		
		//LinkedList<E> 인스턴스의 순환
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();			
	}

}
//Console --> 첫번째 줄은 ArrayList로 찾아서 읽은거고 두번째는 LinkedList로 찾아서 읽은거