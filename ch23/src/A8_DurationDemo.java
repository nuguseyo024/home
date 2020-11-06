import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class A8_DurationDemo
{
	public static void main(String[] args)
	{
		LocalDateTime dt1 = LocalDateTime.of(2020, Month.NOVEMBER, 12, 15, 30); //년월일 시분
		LocalDateTime dt2 = LocalDateTime.of(2020, Month.DECEMBER, 12, 15, 30);
		
		Duration drDate1 = Duration.between(dt1, dt2);
		System.out.println(drDate1);
		
		LocalDateTime dt3 = LocalDateTime.of(2020, Month.NOVEMBER, 5, 11, 54); //년월일 시분
		LocalDateTime dt4 = LocalDateTime.of(2021, Month.FEBRUARY, 4, 0, 0);
		
		Duration drDate2 = Duration.between(dt3, dt4);
		System.out.println(drDate2);
		
	}

}
