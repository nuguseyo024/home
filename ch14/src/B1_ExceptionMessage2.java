import java.util.InputMismatchException;
import java.util.Scanner;
public class B1_ExceptionMessage2
{
	public static void md1(int n){
		md2(n,0); //이 지점으로 md2로부터 예외가 넘어온다
	}
	public static void md2(int n1, int n2) 
	{
		int r = n1 / n2; //예외 발생 지점
	}
	
	public static void main(String[] args)
	{
		try {
			md1(3); //이 지점으로 md1로부터 예외가 넘어온다.
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("Godo bye");
		
		
	}
}
