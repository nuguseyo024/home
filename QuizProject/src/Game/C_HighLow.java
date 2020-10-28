package Game;

import java.util.Random;
import java.util.Scanner;

public class C_HighLow
{

	public static void main(String[] args)
	{
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나는 지금 0 부터 100 사이의 값 중에 하나를 생각하겠습니다.\n당신은 그 숫자를 6회 안에 맞추시면 됩니다..");
		while(true)
		{
			int com = rand.nextInt(101);
			System.out.println("\n 몇이라고 생각합니까? < 0 to 100 >");
			for(int i = 5; i >= 0; i--)//i(기회)는 6번 주어짐
			{
				//랜덤으로 숫자가 주어지고 사용자가 숫자를 입력해서 그 크기를 비교
				
				int user = sc.nextInt();
				
				if(user < com) 
				{System.out.printf("%d 은/는 제가 정한 숫자보다 작습니다. \n[ %d ] 의 기회가 남았습니다.\n", user, i);}
				else if(user > com) 
					{System.out.printf("%d 은/는 제가 정한 숫자보다 큽니다. \n[ %d ] 의 기회가 남았습니다.\n", user, i);}
				else if(user == com)
					{System.out.printf("%d 은/는 정답입니다.\n 축하합니다!", user); break;}
				if(i == 0)
				{
					System.out.println("\n== GAME OVER ==");
					System.out.printf("\n 정답은 %d 입니다.",com);
				}
				
			}
			System.out.println("\n\n게임을 더 진행하시겠습니까? (y/n)");
			String str = sc.next();
			if(!str.equalsIgnoreCase("y"))
				{
				System.out.println("Good bye~");
				break;
				}
		}
	}
}
