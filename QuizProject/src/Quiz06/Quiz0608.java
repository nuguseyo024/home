package Quiz06;

public class Quiz0608
{

	public static void main(String[] args)
	{
		for(int i = 2; i <= 8; i=i+2)
		{
			
			for(int j = 1; j<=i; j++)
			{
				if(i >= j)
				{
					System.out.printf("%d x %d = %d \n", i, j, i*j);
				}
				
			}System.out.println("~~~~~~~~~~~~~~~~~~");
		}

	}

}

//문제 06-08
//구구단을 출력하되 짝수단만 출력하도록 프로그램을 작성하라.
//단, 2단은 2*2까지만, 4단은 4*4까지만....8단은 8*8까지만 출력해야 한다.




