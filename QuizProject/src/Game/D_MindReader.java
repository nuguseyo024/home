package Game;
import java.util.Scanner;
public class D_MindReader
{
	public static void main(String[] args)//ssam
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0부터 100사이의 값 중 하나를 생각하세요");
		int min = 0;
		int max = 101;
		int avg;
		
		for(int i = 0; i <8 ; i++) 
		{
			avg = (min + max) / 2;
			System.out.printf("당신이 선택한 숫자는 %d 입니까?\n", avg);
			String str = sc.nextLine();
			
			if(str.equalsIgnoreCase("y"))
			{
				System.out.println("정답입니다. [ " + (i + 1) + "회차 ]");
				break;
			}
			else if(str.equalsIgnoreCase("h"))
				max = avg;
			else if(str.equalsIgnoreCase("l"))
				min = avg;
			
		}
		
	}

}
