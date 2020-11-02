import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class A7_PrimitiveColletion
{

	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		// 저장 과정에서 오토 박싱
		list.add(10);
		list.add(20);
		list.add(30);
		
		// ArrayList<Integer> list2 = new ArrayList<>(list);	// 에러 없이 사용 가능
		// ArrayList<Integer> list3 = list;						// 에러 발생. 사용 불가능
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) 
		{
			n = itr.next();				// 오토 언박싱
			System.out.print(n + "\t");
		}
		System.out.println();
	}

}
