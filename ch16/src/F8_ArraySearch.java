import java.util.Arrays;

public class F8_ArraySearch
{

	public static void main(String[] args)
	{
		int[] ar = {55, 11, 33, 44, 22};
		
		Arrays.sort(ar);
		for(int n : ar)
			System.out.print(n + "\t");
		System.out.println();
		
		int idx = Arrays.binarySearch(ar, 33);
		System.out.println("Index of 33 : " + idx);
		//음수값이 나오면 배열 안에 찾으려는 숫자가 없는것임
	}
}
