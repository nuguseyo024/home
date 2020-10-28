package Game;

import java.util.Random;

public class B_RandomNumber
{
	
	public static void main(String[] args)
	{
		Random randomV1 = new Random();
		
		
		while(true)
		{
			int n100 = randomV1.nextInt(9)+1;
			int n10 = randomV1.nextInt(9)+1;
			int n1 = randomV1.nextInt(9)+1;
			
			if(n10 != n1 && n100 != n1 && n10 != n100) 
			{
				System.out.printf("%d %d %d\n", n100, n10, n1);break;
			}	
			else
				continue;
		}
	}

}
//int rtn = (rd.nextInt(900) + 100);
//int num1 = (rtn / 100);
//int num2 = ((rtn - (num1 * 100)) / 10);
//int num3 = (rtn - ((num1 * 100) + (num2 * 10)));
//수학적으로 계산해서 푸는 방식
