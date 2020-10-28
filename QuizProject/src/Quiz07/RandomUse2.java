package Quiz07;

import java.util.Random;

public class RandomUse2
{

	public static void main(String[] args)
	{
		Random randomV1 = new Random();
		
		System.out.println(randomV1.nextInt());
		System.out.println(randomV1.nextInt(100)); //0~99까지의 수 출력
		System.out.println(randomV1.nextInt(100)+900); // 900~1000까지의 수 출력 
	
//	double randomV2 = Math.random();
//	System.out.println("1 : " + randomV2);
//	int intVal = (int)(randomV2 * 100) + 1;
//	System.out.println("2 : " + intVal);
//	거의 안씀
	}
	

}
