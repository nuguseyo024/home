package Game;
import java.util.Scanner;
public class D_MindReader2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = new String("l");
		String str2 = new String("h");
		String str3 = new String("y");
		
		System.out.println("0부터 100사이의 값 중 하나를 생각하세요");
		int n = 0;
		int max = 100;
		int min = 0;
		
		while(true)
		{
			n = (max + min) / 2;
			
			System.out.printf("당신이 선택한 숫자는 %d ? \n" , n);
			String user = sc.nextLine();
			
			if(user.equals(str1)) //l 낮다고 대답하면 올려줘야지
			{
				max = max + (max + min) / 2;
			}
			else if(user.equals(str2))
			{
				min = max - (max + min) / 2;
			}
			if(user.equals(str3))
			{
				System.out.println("정답쓰");
				break;
			}
		}
		
		
	}

}