package Quiz06;
import java.util.Scanner;

public class Quiz0601
{

	public static void main(String[] args)
	{
		System.out.println("두 개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int diff;
		diff = (num < num1) ? (num1 - num) : (num - num1);
		
		System.out.printf("두 수의 차는 %d입니다", diff);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("두 개의 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int result1;
//		int result2;
//		
//		result1 = (num1 - num2);
//		result2 = (num2 - num1);
//		
//		if(num1 - num2 > 0)
//		{
//			System.out.println(result1);
//		}
//		else
//		{
//			System.out.println(result2);
//		}

	}

}
