package Quiz13;

public class Quiz13_6_2
{
	public static void main(String[] args)
	{
		int[][] gugu = new int[3][9];
		int num = 1;
		
		for(int i = 0; i < gugu.length; i++) {
			for(int j = 0; j <  gugu[i].length; j++) {
				
				gugu[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i < gugu.length; i++)
		{
			for(int j = 0; j <gugu[i].length; j++)
				System.out.printf("%d x %d \t",i,j);
			System.out.println();
		}
	}
}
//문제6
//가로가 9, 세로가 3인 int형 2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
//그리고 제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라
