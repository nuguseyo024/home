package Quiz02;
import java.util.Scanner;
public class Quiz0204_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
	
	}
}
