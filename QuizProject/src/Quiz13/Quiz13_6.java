package Quiz13;

public class Quiz13_6
{

	public static void main(String[] args)
	{
		int[][] gugu = new int[3][9];
		int num = 1;
		
		for(int i = 2; i <= 4; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 1)
					System.out.println("=======" + i +" 단 =========");
				System.out.printf("%d x %d = %d \n",i,j,i*j);
			}
			
		}
	}

}
//문제6
//가로가 9, 세로가 3인 int형 2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
//그리고 제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라