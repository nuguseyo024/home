package Quiz06;
import java.util.Scanner;

public class Quiz0605_ssam
{

	public static void main(String[] args)
	{
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		while(true)
		{
			int num = sc.nextInt();
			result = result + num;
			if (num == 0)
			{
				System.out.println(result);
				break;
			}
		}

	}

}
