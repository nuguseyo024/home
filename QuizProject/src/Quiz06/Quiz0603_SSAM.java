package Quiz06;
import java.util.Scanner;

public class Quiz0603_SSAM
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		long num = sc.nextInt();
		
		long result = 1;
		while (num > 0)
		{
			if (num > 1)
			{
				System.out.print(num + " * ");
			}
			else
			{
				System.out.print(num + " = ");
			}
			result = result * num;
			num--;
		}
		System.out.println(result);
	}

}
