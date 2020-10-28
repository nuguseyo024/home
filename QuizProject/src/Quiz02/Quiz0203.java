package Quiz02;
import java.util.Scanner;
public class Quiz0203
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1; //몫
		int sum2; //나머지
		
		sum1 = (num1 / num2);
		sum2 = (num1 % num2);
		
		System.out.printf("%d 나누기 %d 의 몫은 " + sum1 + " 입니다. \n", num1, num2);
		System.out.printf("%d 나누기 %d 의 나머지는 " + sum2 + " 입니다. \n", num1, num2);
		
	}
}
	
	
	
	
//문제 3 : 02-03
//두 개의 정수를 입력받아서 다음과 같은 출력결과를 만들어보자.
//출력예) 두개의 정수를 입력하세요.
//25    4 
//25 나누기 4 의 몫은 6 입니다.
//25 나누기 4 의 나머지는 1 입니다.
