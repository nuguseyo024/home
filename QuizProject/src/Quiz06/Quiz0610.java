package Quiz06;
import java.util.Scanner;

public class Quiz0610
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int nResult = 0;
		for(int i = 0; i < 5; )
		{
			System.out.print("5개 입력! : ");
			int nTemp = sc.nextInt();
			if(nTemp < 1)
			{
				System.out.println("== Re! ==");
				continue;
			}
			nResult = nResult + nTemp;
			i++;
		}
		System.out.println(nResult);
	}
}


//문제 06-10
//사용자로부터 5개의 정수를 입력받아서 합을 구하여 출력한다.
//만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구해야 한다. 
//그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.