package Game;
import java.util.Scanner;
import java.util.Random;

public class E_BaseBallGame
{
	public static void main(String[] args)
	{
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in);
		int rtn = (rand.nextInt(900) + 100);
		
		int com1 = (rtn / 100);
		int com2 = ((rtn - (com1 * 100)) / 10);
		int com3 = (rtn - ((com1 * 100) + (com2 * 10)));
		
		System.out.printf("%d %d %d",com1, com2, com3);
		
		while(true) 
		{
			
		}
		
		
		
		
		
		
		
	}

}
