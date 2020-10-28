package Quiz02;
import java.util.Scanner;
public class Quiz0205_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요. : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = (num1 * num2);
		
		if(result < 0) 
		{
			System.out.println(-result);
		}
		else
			System.out.println(result);
	}

}

//문제 5 : 02-05
//사용자로부터 두 개의 정수를 입력받아서 곱한 값의 결과를 절대값으로 출력하는 프로그램을 작성하라.

//num3 = (num3 >= 0) ? num3 : (-1*num3);
//System.out.println(num3);