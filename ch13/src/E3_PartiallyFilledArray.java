
public class E3_PartiallyFilledArray
{

	public static void main(String[] args)
	{
		int[][] arr = 
		{
			{11},
			{22, 33},
			{44, 55, 66}
		};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
		

	}

}
//length 를 뽑으면 앞 배열 갯수
//배열[].length를 뽑으면 각각의 갯수