import java.util.InputMismatchException;
import java.util.Scanner;
public class B1_ExceptionMessage1
{
	public static void md1(int n){
		md2(n,0); //아래의 메소드 호출
	}
	public static void md2(int n1, int n2) //n2에 0이 들어와서 오류 발생
	{
		int r = n1 / n2; //예외 발생 지점
	}
	
	public static void main(String[] args)
	{
		md1(3);
		System.out.println("Godo bye");
		
	}
}
