package Game;
import java.util.Scanner;
import java.util.Random;
public class A_RPSGame
{

	public static void main(String[] args)
	{
		Random randomV1 = new Random(); // 힙으로 들어감
		Scanner sc = new Scanner(System.in);
		
	
		while(true) 
		{
			System.out.println("숫자를 입력하세요.(1: 가위 2: 바위 3: 보)");
			int user = sc.nextInt(); //기본자료형 (int) : 스택으로 들어감
			int com = randomV1.nextInt(2);
			if     (user == 1/* user 가위 */ && com == 0) System.out.println("사용자 : 가위,  컴퓨터 : 가위\n == 비겼습니다. ==\n");
			else if(user == 1/* user 가위 */ && com == 1) System.out.println("사용자 : 가위,  컴퓨터 : 바위\n == 졌습니다. ==\n");
			else if(user == 1/* user 가위 */ && com == 2) System.out.println("사용자 : 가위,  컴퓨터 : 보\n == 이겼습니다. ==\n");
			
			else if(user == 2/* user 바위 */ && com == 0) System.out.println("사용자 : 바위,  컴퓨터 : 가위\n == 이겼습니다. ==\n");
			else if(user == 2/* user 바위 */ && com == 1) System.out.println("사용자 : 바위,  컴퓨터 : 바위\n == 비겼습니다. ==\n");
			else if(user == 2/* user 바위 */ && com == 2) System.out.println("사용자 : 바위,  컴퓨터 : 보\n == 졌습니다. ==\n");
			
			else if(user == 3/* user  보  */ && com == 0) System.out.println("사용자 : 보,  컴퓨터 : 가위\n == 졌습니다. ==\n");
			else if(user == 3/* user  보  */ && com == 1) System.out.println("사용자 : 보,  컴퓨터 : 바위\n == 이겼습니다. ==\n");
			else if(user == 3/* user  보  */ && com == 2) System.out.println("사용자 : 보,  컴퓨터 : 가위\n == 졌습니다. ==\n");
			
			else if(user == 0) {System.out.println("== 게임을 종료합니다. =="); break;}
			
		}
	}

}
