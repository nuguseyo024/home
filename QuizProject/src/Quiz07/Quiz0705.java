package Quiz07;

import java.util.Scanner;

public class Quiz0705
{

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 정수");
		int n1 = sc.nextInt();
		System.out.println("2번 정수");
		int n2 = sc.nextInt();
		System.out.println("3번 정수");
		int n3 = sc.nextInt();
		System.out.println();
		MyAdd(n1,n2,n3);
	}
	public static void MyAdd(int num1, int num2, int num3)
	{
		double result = 0;
//		int nResult = num1 + num2;
//		System.out.println(nResult);
		if(num3 == 1) 
		{
			result = num1 + num2;
		}
		else if(num3 == 2) 
		{
			result = num1 - num2;
		}
		else if(num3 == 3) 
		{
			result = num1 * num2;
		}
		else if(num3 == 4) 
		{
			result = num1 / num2;
		}
		else 
		{
			System.out.println("전체 다시 입력");
		}
	}

}
//문제5
//세 개의 정수를 입력 받아서 앞의 두 수는 연산에 이용하고 세 번째 수는 연산자로 사용한다.
//세번째 인수가 1이면 +, 2이면 -, 3이면 *, 4이면 / 연산을 한다. 그 외의 수가 들어오면 다시 전체 입력을 받는다.
//각 각의 연산은 메서드로 만들어 호출한다.