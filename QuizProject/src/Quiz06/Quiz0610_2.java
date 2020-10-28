package Quiz06;
import java.util.Scanner;

public class Quiz0610_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int nResult = 0;
		int nCount = 0;
		while(nCount < 5) 
		{
			System.out.println("입력!");
			int n = sc.nextInt();
			if(n<1)
				continue;
			nResult = nResult + n;
			nCount++;
			
		}
		System.out.println(nResult);

	}

}
