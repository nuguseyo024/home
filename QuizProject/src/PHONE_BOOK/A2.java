package PHONE_BOOK;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A2
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("[ 메뉴 선택 ]\n "
							+ "1. 전화번호 입력\n "
							+ "2. 전화번호 조회\n "
							+ "3. 전화번호 삭제\n "
							+ "4. 종료\n "
							+ "메뉴 번호를 입력하세요 :  ");
			int user = sc.nextInt();
			if(user == 1) {numInput1(1);}
			else if(user == 2) {numInput2(2);}
			
		}
	}	
	public static void numInput1(int user)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" 이름을 입력하세요 : ");
		String username = sc.nextLine();
		System.out.print(" 전화번호를 입력하세요 : ");
		int usernum = sc.nextInt();
		System.out.print(" 이메일을 입력하세요 : ");
		String usermail = sc.next();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(username + ".txt")))
		{
			bw.write("이름 : " + username);     bw.newLine();
			bw.write("전화번호 : " + usernum);  bw.newLine();
			bw.write("이메일 : " + usermail);   bw.newLine();
		}catch(Exception e) {e.printStackTrace();}
		
	}
	public static void numInput2(int user) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 이름을 입력하십시오. : ");
		String ph = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader (new FileReader(ph + ".txt")))
		{
			String str;
			System.out.println("=================");
			while(true) {	
				ph = br.readLine();
				if(ph == null)
					break;
				System.out.print(ph);  System.out.println();
			}
			System.out.println("=================");
		}catch(IOException e) {e.printStackTrace();}
		
	}
}	




	


