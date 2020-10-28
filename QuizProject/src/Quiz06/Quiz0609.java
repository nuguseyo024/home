package Quiz06;
import java.util.Scanner;

public class Quiz0609
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
//		for(int i = num; i == num ; i++)
//		{
//			for(int j = 9; j > 0; j--) 
//			{
//				System.out.printf("%d x %d = %d \n", i, j, i*j);
//			}
//			
//		}
		for(int i = 9; i>0; i--)
		{
			System.out.printf("%d x %d = %d \n", num, i, num*i);
		}

	}

}

//문제 06-09
//사용자로부터 정수 하나를 입력받은 후 그 수에 해당하는 구구단을 역순으로 출력하시오.		