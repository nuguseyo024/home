package Quiz13;
import java.util.Scanner;

public class Quiz13_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.println("정수를 입력하세요.");
			num[i] = sc.nextInt();
		}
		System.out.println(num.length + "개의 정수를 입력받았습니다.\n");
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			sum = sum + num[i];
			
			if (num[max] < num[i])
				max = i;
			if(num[min] > num[i])
				min = i;
		}
		System.out.printf("모든 수의 합은 %d 입니다.\n",sum);
		System.out.println("최대값은 : " + num[max]);
		System.out.println("최소값은 : " + num[min]);
	}
}
//문제1
//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.
