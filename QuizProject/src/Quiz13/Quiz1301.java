package Quiz13;

import java.util.Scanner;

public class Quiz1301 //ssam
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] myNum /*선언*/ = new int[5];
		
		for(int i = 0;i < 5; i++)
		{
			myNum[i] = sc.nextInt();
		}		
		int nMax = getMax(myNum); 
		getMax(myNum);
		getMin(myNum);
		getTotal(myNum);
	}
	
	public static int getMax(int[] num)
	{
		int nMax = num[0];//nMax에 첫번째로 입력받는 수 num[0]을 넣어줌
		for(int i = 0;i < num.length; i++) //num의 갯수가 몇개가 될지를 모르는데 쟤 숫자만큼 들어가니까
		{
			if(nMax < num[i]) 
			{
				nMax = num[i]; //쟤가 나보다 크면 넣어주고 아니면 걍 통과
			}	
		}
		System.out.println("최대값 : " + nMax);
		return nMax;
	}
	public static int getMin(int[] num)
	{
		int nMin = num[0];//nMin에 첫번째로 입력받는 수 num[0]을 넣어줌
		for(int i = 0;i < num.length; i++) //num의 갯수가 몇개가 될지를 모르는데 쟤 숫자만큼 들어가니까
		{
			if(nMin > num[i]) 
			{
				nMin = num[i]; //쟤가 나보다 작으면 넣어주고 아니면 걍 통과
			}	
		}
		System.out.println("최솟값 : " + nMin);
		return nMin;
	}
	public static int getTotal(int[] num)
	{
		int nSum = 0;//nMax에 첫번째로 입력받는 수 num[0]을 넣어줌
		for(int i = 0;i < num.length; i++) //num의 갯수가 몇개가 될지를 모르는데 쟤 숫자만큼 들어가니까
		{
			nSum = nSum + num[i];	
		}
		System.out.println("합 : " + nSum);
		return nSum;
	}
}
// 하 ㅅㅄ ㅄㅄㅄㅄ 존나어렵네 시바 ㅅㅄㅂ 이시댕ㅇ  ㅅㅅㅅㅅㅅㅅㅅ
