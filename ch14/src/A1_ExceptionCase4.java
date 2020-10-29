import java.util.InputMismatchException;
import java.util.Scanner;
public class A1_ExceptionCase4
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
		catch(ArithmeticException | InputMismatchException e) //둘 중 하나라도 예외 발생하면 처리
		{	
			e.getMessage();
			System.out.println(e.getMessage());
		}
		System.out.println("Good bye");
	}
}
