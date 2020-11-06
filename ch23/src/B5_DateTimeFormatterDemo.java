import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B5_DateTimeFormatterDemo
{

	public static void main(String[] args)
	{
		ZonedDateTime date = 
				ZonedDateTime.of(LocalDateTime.of(2021, 2,4, 12, 53), ZoneId.of("Asia/Seoul"));
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-M-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-MM-dd, a HH:mm:ss VV");	
		
		System.out.println(date.format(fm1));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
		
		DateTimeFormatter fm00 = DateTimeFormatter.ofPattern("G , Q , yyyy-ww-MMM-dd, F, E, HH:mm");
		System.out.println(date.format(fm00));
	}

}
