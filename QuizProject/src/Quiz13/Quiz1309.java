package Quiz13;

public class Quiz1309
{

	public static void main(String[] args)
	{
		int[] ar = {211, 11, 77, 122, 37};
		int tmp = 0;
		
		System.out.println("정렬 전 : ");
		for(int j = 0; j<ar.length; j++)
		{
			System.out.print(ar[j] + "  ");
		}
		System.out.println();
		
		for(int i = 0; i<(ar.length - 1); i++)
		{
			for(int j = 0; j < ar.length - 1; j++)
			{
				if(ar[j] > ar[j+1])
				{
					tmp = ar[j+1];
					ar[j+1] = ar[j];
					ar[j] = tmp;
				}
			}
			//중간 출력 :
			System.out.println((i+1) + " 차 : ");
			for(int j = 0; j<ar.length; j++)
			{
				System.out.print(ar[j] + "  ");
			}
			System.out.println();
		}
		
		System.out.print("정렬 후 : ");
		for(int j=0; j < ar.length; j++)
		{
			System.out.print(ar[j] + "  ");
		}
		System.out.println();
	}
}
