package Quiz06;
import java.util.Scanner;

public class Quiz0606_ssam
{

	public static void main(String[] args)
	{
	
		System.out.print("몇 개의 정수를 입력하시겠습니까? : ");
		Scanner sc = new Scanner(System.in);
		int nCount = sc.nextInt();
		int nResult = 0;
		double nAverage = 0.0;
		
		for(int i=0; i < nCount; i++)
		{
			int nTemp = sc.nextInt();
			nResult = nResult + nTemp;
		}
		
		nAverage = nResult / nCount;
		System.out.println(nAverage);
	}

}
//갯수가 정해지면 for를 쓰는게 관행이요