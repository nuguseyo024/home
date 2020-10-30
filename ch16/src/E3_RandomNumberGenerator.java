import java.util.Random;
public class E3_RandomNumberGenerator
{
	public static void main(String[] args)
	{
		Random rand = new Random(); // java 안에 이미 seed값이 시간값으로 주어져있음
		
		for(int i = 0; i< 7; i++)
			System.out.print(rand.nextInt(10) + " ");
	}

}
