package Quiz13;
import java.util.Scanner;

public class ch13_3 {

	public static void main(String[] args) 
	{
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("10개 입력");
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("\n홀수 : ");
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 1)
				System.out.printf("  %d  ",num[i]);
		}
		System.out.print("\n짝수 : ");
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
				System.out.printf("  %d  ",num[i]);
		}	
	
	}
}

//문제3
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.
