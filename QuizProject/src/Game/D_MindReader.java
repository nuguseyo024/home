package Game;
import java.util.Scanner;
public class D_MindReader
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = new String("l");
		String str2 = new String("h");
		System.out.println("0부터 100사이의 값 중 하나를 생각하세요");
		
		
		for(int i = 100; i > 1; i--) 
		{
			System.out.printf("당신이 선택한 숫자는 %d 입니까?\n", i/2);
			String user = sc.nextLine();
			if(user.equals(str1))
			{
				i = i + i/2;
			}
			else if(user.equals(str2))
			{
				i = i - i/2 - i/2;
			}
			else
				System.out.println("정답입니다.  " + i );
		
			
		}
		
	}

}
