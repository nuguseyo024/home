package Quiz13;

public class Quiz1306 //ssam
{
	public static void main(String[] args)
	{
		int[][] nArray = new int[3][9];
		
		for(int i = 2; i < 5; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				nArray[i-2][j-1] = i*j;
				
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				System.out.print(nArray[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
//문제6
//가로가 9, 세로가 3인 int형 2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
//그리고 제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라


/* 이런 방법도 있음~~~~
int[][] nArray = 
{
	{2*1, 2*2, 2*3, 2*4, 2*5, 2*6, 2*7, 2*8, 2*9},
	{3*1, 3*2, 3*3, 3*4, 3*5, 3*6, 3*7, 3*8, 3*9},
	{4*1, 4*2, 4*3, 4*4, 4*5, 4*6, 4*7, 4*8, 4*9}
}
*/