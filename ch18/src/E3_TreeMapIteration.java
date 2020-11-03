import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class E3_TreeMapIteration
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		
		//Key-Value 기반 데이터 저장
		map.put(45,  "Brown0");
		map.put(24,  "James");
		map.put(72,  "Martisn");
		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		//전체 key 출력(for-each)
		for(Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		//전체 value 출력(for-each)
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		//전체 value 출력(반복자)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
	}
}
