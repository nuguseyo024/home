import java.time.LocalDate;

public class A2_LocalDateDemo1
{

	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("XMAAS : " + xmas);
		
		LocalDate eve = xmas.minusDays(1);
		System.out.println("XMAS EVE : " + eve);
		
	}

}
