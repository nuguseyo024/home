package Game;
import java.util.Scanner;
import java.util.Random;

public class E_BaseBallGame2
{
	public static void main(String[] args)
	{
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in);
		int com1 = rand.nextInt(8)+1;
		int com2 = rand.nextInt(8)+1;
		int com3 = rand.nextInt(8)+1;
		
		while(true)
		{
			
			for(int i = 0; ; i++)
			{
				System.out.println("세자리 숫자 입력");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int n3 = sc.nextInt();
				
				System.out.printf("%d | %d | %d \n",n1, n2, n3);
				System.out.printf("%d | %d | %d \n",com1, com2, com3);
				
				if(n1 == com1)
				{
					System.out.println("1 S");
					if(n2 == com2) 		System.out.println("1 S");
					else if(n2 == com1) System.out.println("1 B");
					else if(n2 == com3) System.out.println("1 B");
					if(n3 == com3) 		System.out.println("1 S");
					else if(n3 == com1) System.out.println("1 B");
					else if(n3 == com2) System.out.println("1 B");
					
				}
				if(n2 == com2)
				{
					System.out.println("1 S");
					if(n1 == com1) 		System.out.println("1 S");
					else if(n1 == com2) System.out.println("1 B");
					else if(n1 == com3) System.out.println("1 B");
					if(n3 == com3) 		System.out.println("1 S");
					else if(n3 == com1) System.out.println("1 B");
					else if(n3 == com2) System.out.println("1 B");
				}
				if(n3 == com3)
				{
					System.out.println("1 S");
					if(n2 == com2) 		System.out.println("1 S");
					else if(n2 == com1) System.out.println("1 B");
					else if(n2 == com3) System.out.println("1 B");
					if(n1 == com1) 		System.out.println("1 S");
					else if(n1 == com2) System.out.println("1 B");
					else if(n1 == com3) System.out.println("1 B");
				}
				
				
				if(n1 != com1)
				{
					
					if(n2 == com2) 		System.out.println("1 S");
					else if(n2 == com1) System.out.println("1 B");
					else if(n2 == com3) System.out.println("1 B");
					if(n3 == com3) 		System.out.println("1 S");
					else if(n3 == com1) System.out.println("1 B");
					else if(n3 == com2) System.out.println("1 B");
					
				}
				if(n2 != com2)
				{
					
					if(n1 == com1) 		System.out.println("1 S");
					else if(n1 == com2) System.out.println("1 B");
					else if(n1 == com3) System.out.println("1 B");
					if(n3 == com3) 		System.out.println("1 S");
					else if(n3 == com1) System.out.println("1 B");
					else if(n3 == com2) System.out.println("1 B");
				}
				if(n3 != com3)
				{
					
					if(n2 == com2) 		System.out.println("1 S");
					else if(n2 == com1) System.out.println("1 B");
					else if(n2 == com3) System.out.println("1 B");
					if(n1 == com1) 		System.out.println("1 S");
					else if(n1 == com2) System.out.println("1 B");
					else if(n1 == com3) System.out.println("1 B");
				}
				else if(n1 == com1 && n2 == com2 && n3 == com3)
				{
					System.out.println("YOU WIN");
					break;
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
