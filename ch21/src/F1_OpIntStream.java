import java.util.stream.IntStream;

public class F1_OpIntStream
{

	public static void main(String[] args)
	{
		int sum = IntStream.of(1,3,5,7,9)
		/* 합 */		   .sum();
		System.out.println("sum = " + sum);
		
		long cnt = IntStream.of(1,3,5,7,9)
		/* 개수 */			.count();
		System.out.println("count = " + cnt);
		
		IntStream.of(1,3,5,7,9) 
				 .average()  /* 평균 */
				 .ifPresent(av -> System.out.println("avg = " + av));
		
		IntStream.of(1,3,5,7,9)
				 .min()		/* 최소 */
				 .ifPresent(mn -> System.out.println("min = " + mn));
		
		IntStream.of(1,3,5,7,9)
				 .max()		/* 최대 */
				 .ifPresent(mx -> System.out.println("max = " + mx));
	
	
	}

}
// )-;|;->      |:^'l_I<