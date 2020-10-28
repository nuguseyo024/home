package Quiz13;

import java.util.Scanner;

public class Quiz1305_
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요. : ");
		String sInput = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(sInput);
		String sReverse = sb.reverse().toString();
		
		if(sInput.equals(sReverse))
			System.out.println("회문입니다.");
		else
			System.out.println("회문이;  ㅏ닙ㄴ다");
		
	}

}
