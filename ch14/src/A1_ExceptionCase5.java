import java.util.InputMismatchException;
import java.util.Scanner;
public class A1_ExceptionCase5
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		try 
		{
			System.out.println("a/b... a?");
			int n1 = kb.nextInt();
			
			System.out.println("a/b... b?");
			int n2 = kb.nextInt();
			
			System.out.printf("%d / %d = %d \n",n1,n2,n1/n2); //예외 발생 지점
		}
		catch(ArithmeticException e) 
		{
			String str = e.getMessage();
			if(str.equals("/ zero"))
				System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(InputMismatchException e)
		{	
			// e.printStackTrace(); <--자세한 오류 내역
			System.out.println(e.getMessage());
		}
		System.out.println("Good bye");
	}
}
