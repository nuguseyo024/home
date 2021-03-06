package Quiz13;

import java.util.Scanner;

public class Quiz1305
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요. : ");
		String sInput = sc.nextLine();
		int nLen = sInput.length();
		System.out.println();
		
		String[] myWord = new String[nLen];
		for(int i = 0; i < nLen; i++)
		{
			myWord[i] = sInput.substring(i, i+1);
		}
		
		int nStart = 0;
		int nEnd = sInput.length() - 1;
		boolean bMy = true;
		for(int i = 0; i < nLen/2; i++)
		{
			if(!myWord[nStart].equals(myWord[nEnd]))
			{
				bMy = false;
			}
			nStart++;
			nEnd--;
		}
		if(bMy)
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");
	}

}

//문제5
//회문(Palindrome)은 앞 or 뒤에서 읽어도 동일한 단어를 뜻한다.
//noon, level 과 같은 단어들이 회문에 속한다.
//사용자로부터 문자열을 입력받은후 회문인지 아닌지 판단하는 프로그램을 작성하시오.
//대소문자까지 동일해야 회문으로 인정함
