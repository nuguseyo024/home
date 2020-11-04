import java.util.stream.Stream;

public class D1_InstSortedStream
{

	public static void main(String[] args)
	{
		Stream.of("BOX", "APPKE", "ROBOT")
			  .sorted()  
		 // String 인스턴스는 Comparable<String> 인터페이스를 구현!
		 // 이를 기반으로 한 정렬(알파벳 순)
			  .forEach(s -> System.out.print(s + '\t'));
		System.out.println();
		
		Stream.of("BOX", "APPKE", "ROBOT")
		  	  .sorted((s1, s2) -> s1.length() - s2.length())
		  // compareTo 메소드에 대한 람다식을 기반으로 정렬 (오름차순)
		  	  .forEach(s -> System.out.print(s + '\t'));
		System.out.println();
	}
}
