
public class D3_InfinityLoop
{

	public static void main(String[] args)
	{
		int num = 1;
		
		while(true)
		{
			if(((num % 6) == 0) && ((num % 14) == 0))
				break;
			
			num++;
		}
		System.out.println(num);
	}

}

//6의 배수이면서 14의 배수인 가장 작은 자연수를 찾는 반복문