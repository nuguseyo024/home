package Quiz13;

public class Quiz13_7 //ssam
{

	public static void main(String[] args)
	{
		int[][] myArr = new int[2][4];
		int num = 1;
		for(int i =0; i < 2; i++)
		{
			for(int j =0; j < 4; j++)
			{
				myArr[i][j] = num;
				System.out.printf("[%d %d] = %d ", i,j,myArr[i][j]);
				num++;
			}
			System.out.println();
		}
		System.out.println("=========================");
		for(int j =0; j < 4; j++)
		{
			for(int i =0; i < 2; i++)
			{
				System.out.printf("[%d %d] = %d ", i,j,myArr[i][j]);
			}
			System.out.println();
		}
	}
}