package Quiz02;
import java.util.Scanner;
public class Quiz0205
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세욥! : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result;
		result = (num1 * num2);
		
		System.out.printf("%d 곱하기 %d 의 값은 : " + result + " 입니다.\n",num1,num2);
		
	}

}

//문제 5 : 02-05
//사용자로부터 두 개의 정수를 입력받아서 곱한 값의 결과를 절대값으로 출력하는 프로그램을 작성하라.
