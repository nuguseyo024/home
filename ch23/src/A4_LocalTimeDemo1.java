import java.time.LocalTime;

public class A4_LocalTimeDemo1
{

	public static void main(String[] args)
	{
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각 : " + now);
		
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		System.out.println("화상 미팅 시각 : " + mt);
	}

}
