import java.util.Scanner;

public class ch13_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
			for(int i = 0; i < num.length; i++)
			{
				System.out.println("10개의 숫자를 입력하세요");
				num[i] = sc.nextInt();	
				if(i == 10)
				{
					if(num[i] % 2 == 1)
						System.out.println("홀 : " + num[i]);
				
				}
			}

	}
}
//문제3
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.