package Quiz13;

import java.util.Scanner;

public class Quiz1304 //ssam
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[10];
		System.out.println("숫자 10개를 입력하시오");
		int nOddCnt  = 0;
		int nEvenCnt = 9;
		
		for(int i = 0; i < 10; i++)
		{
			int nTemp = sc.nextInt();
			if(nTemp % 2 == 1)
			{
				//홀수
				myNum[nOddCnt] = nTemp;
				nOddCnt++;
			}
			else
			{
				//짝수
				myNum[nEvenCnt] = nTemp;
				nEvenCnt--;
			}
		}// 입력 for문
		
		for(int i = 0; i<10; i++)//출력 for문
		{System.out.print(myNum[i] + "  ");}
	}
}
//문제4
//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받는다.
//단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
//출력예시) 총 10개의 정수를 입력하시오.

