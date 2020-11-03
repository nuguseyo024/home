import java.util.HashMap;

public class E1_HashMapCollection
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		//Key-Value 기반 데이터 저장
		map.put(45,  "Brown0");
		map.put(24,  "James");
		map.put(72,  "Martisn");
		
		//데이터 탐색
		System.out.println("24번 : " + map.get(24));
		System.out.println("45번 : " + map.get(45));
		System.out.println("72번 : " + map.get(72));
		
		System.out.println();
		
		//데이터 삭제
		map.remove(24);
		
		//데이터 삭제 확인
		System.out.println("24번 : " + map.get(24));
		
	}
}
