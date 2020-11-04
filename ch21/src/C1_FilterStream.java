import java.util.Arrays;
import java.util.List;

public class C1_FilterStream
{

	public static void main(String[] args)
	{
		int[] ar = {1,2,3,4,5};
		Arrays.stream(ar)
			  .filter(n -> n%2 ==1)	//홀수만 필터링
			  .forEach(n -> System.out.print(n + "\t")); //필터링한거 출력
		System.out.println();
		
		
		List<String> sl = Arrays.asList("TOy", "RObot", "Box");
		
		sl.stream()	
			.filter(s -> s.length() == 3) //단어길이 3인것만 필터링
			.forEach(s -> System.out.print(s + "\t")); //필터링한거 출력
			System.out.println();
	}
}
