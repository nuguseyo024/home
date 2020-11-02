import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B1_SetCollectionFeature
{

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		
		for(String s : set)
			System.out.print(s + '\t');
		System.out.println();
	}
}
// 중복된 인스턴스는 저장되지 않음
// --> 동일 인스턴스란? 
// --> String은 주소가 달라도 내용이 같으면 동일한 것으로 취급 (equals 활용)
// 자료형(int 등)의 경우 hashCode의 주소가 동일하면 동일한 것으로 취급