import java.util.Arrays;

public class F3_ArrayEquals
{
	public static void main(String[] args)
	{
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = Arrays.copyOf(ar1,  ar1.length); //ar1과 ar1.length이 같은지를 알아보는 코드
		
		System.out.println(Arrays.equals(ar1, ar2));
		
	}

}
