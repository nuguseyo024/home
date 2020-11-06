import java.time.LocalDateTime;

public class A6_LocalDateTimeDemo1
{

	public static void main(String[] args)
	{
		//현재 날짜와 시각
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		//영국 바이어와 22시간 35분 뒤에 화상 미팅 예정
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		//화상 미팅 날짜와 시각
		System.out.println(mt);
		
	}

}
//페리오드는 날짜 듀레이션은 초계산