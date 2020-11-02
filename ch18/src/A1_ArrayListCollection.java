import java.util.LinkedList;
import java.util.List;

public class A1_ArrayListCollection
{
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();
		
		//인스턴스 저장 : 순서 있음. 중복 허용.
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 인스턴스 참조
		for(int i = 0; i< list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		// 첫 번째 자리 인스턴스 ("Toy") 삭제
		list.remove(0);
		
		// 삭제 후 인스턴스 참조
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}
}
//Arraylist 는 List를 상속받았삼