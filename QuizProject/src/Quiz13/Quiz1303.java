package Quiz13;
import java.util.Scanner;
public class Quiz1303 //ssam
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[10];
		System.out.println("숫자 10개를 입력하시오");
		for(int i = 0; i < 10; i++)
		{
			myNum[i] = sc.nextInt();
		}
		// 길이가 10인 배열을 선언한후 총 10개의 정수를 입력받는다
		
		System.out.print("짝수 : ");
		for(int i = 0; i < 10; i++)
		{
			if(myNum[i] % 2 == 0)//짝수
			{
				System.out.print("  "+myNum[i]); //짝수만 출력
			}
				
		}
		
		System.out.println(); //줄바꿈
		
		System.out.print("홀수 : ");
		for(int i = 0; i < 10; i++)
		{
			if(myNum[i] % 2 == 1)//홀수
			{
				System.out.print("  "+myNum[i]); //홀수만 출력
			}
				
		} 
	}

}