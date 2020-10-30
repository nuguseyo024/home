import java.util.Random;
public class E1_SeedSetRandom
{
	public static void main(String[] args)
	{
		Random rand = new Random(System.currentTimeMillis()); //seed값으로 시간을 숫자로 반환한 값을 줌
		
		for(int i = 0; i< 7; i++)
			System.out.print(rand.nextInt(10) + " ");
		System.out.println();
	}

}// 실행할 때마다 다른 랜덤 값
