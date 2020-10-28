package Quiz06;
import java.util.Scanner;

public class Quiz0602
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학의 점수를 차례대로 입력하세요. : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int result = ((kor + eng + mat) / 3);
		
		if(result >= 90) 
		{
			System.out.println("A");
		}
		else if(result >= 80)
		{
			System.out.println("B"); 
		}
		else if(result >= 70)
		{
			System.out.println("C");
		}
		else if(result >= 50)
		{
			System.out.println("D");
		}
		else
			System.out.println("F");
	}

}
