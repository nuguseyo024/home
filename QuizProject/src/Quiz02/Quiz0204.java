package Quiz02;
import java.util.Scanner;
public class Quiz0204
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세용 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < num2) 
		{
			System.out.printf("%d 는 %d 보다 큽니다. \n", num2, num1);
		}
		if (num1 > num2)    //else
		{
			System.out.printf("%d 는 %d 보다 큽니다. \n", num1, num2);
		}
		
		
	}

}
//문제 4 : 02-04
//사용자로부터 두 개의 정수를 입력받아서 큰 값을 출력하는 프로그램을 작성하라.
