package Quiz07;

public class Quiz0701
{

	public static void main(String[] args)
	{
		
		double avg = getAverage(3, 12, 9);
		
		System.out.println("평균은 : " + avg);
	}
	public static double getAverage(int n1,int n2,int n3)
	{
		double avg = (double)((n1+n2+n3)/3);
		return avg;
	}

}
//문제1
//세 개의 정수를 인자로 전달 받아서 평균을 반환하는 함수를 정의하라
