import java.util.Scanner;

public class test {

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
