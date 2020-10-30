import java.util.Arrays;

public class F6_ArraySort
{
	public static void main(String[] args)
	{
		int[] ar1 = {1,5,3,200,4};
		double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int n : ar1)
			System.out.print(n + "\t");
		System.out.println();
		
		for(double n : ar2)
			System.out.print(n + "\t");
		System.out.println();
	}

}
//compareTo 는 쟤가 크면 1, 내가 크면 -1 같으면 0을 반환
//compareTo 를 쓰려면 Comparable을 먼저 implements 해줘야한다