package Game;

import java.util.Random;
import java.util.Scanner;

public class A3_RPSGame
{
	public static void random(int com ) 
	{
		     if(com == 0) System.out.print("컴퓨터 : 가위\n");
		else if(com == 1) System.out.print("컴퓨터 : 바위\n");	
		else if(com ==2)  System.out.print("컴퓨터 : 보\n");
	}
	public static void input(int user)
	{
		if(user != 0) 
		{
			     if(user == 1)  System.out.print("사용자 : 가위,  ");			
			else if(user == 2)  System.out.print("사용자 : 바위,  ");			
			else if(user == 3)  System.out.print("사용자 : 보,  ");		
				 else 		    System.out.println("다시");			
		}


	}
	public static void main(String[] args)
	{
		Random randomV1 = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("무엇을 내겠습니까? (1 : 가위, 2 : 바위, 3 : 보, 0 : 종료)");	
			int com = randomV1.nextInt(3);
			int user = sc.nextInt();	
			if(user != 0)
			{
				input(user);	
				random(com);
			}
			else if(user == 0)
				System.out.println("끝");
//				break;
		}
		
	}
	
}
//s.close();
//}			else
//	System.out.println("끝");

//switch(user) 
//{
//case 1:
//	System.out.println("가위");
//	break;
//case 2:
//	System.out.println("바위");
//	break;
//case 3 :
//	System.out.println("보");
//	break;
//default:
//	System.out.println("다시 입력하세요");

//if(user != 0)
//{
//	if(user == 1) 
//	{
//		System.out.println("사용자 : 가위   |");	
//		System.out.print(com);
//	}
//	else if(user == 2)
//	{
//		System.out.println("사용자 : 바위   |");
//	}
//	else if(user == 3)
//	{
//		System.out.println("사용자 : 보   |");
//	}	
//	else
//	{
//		System.out.println("다시 입력하세요.");
//	}
//	
//}
//else 
//{
//	System.out.println("게임을 종료합니다.");
//	break;
//}

