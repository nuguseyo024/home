import java.time.ZoneId;

public class B1_ZoneIdDemo1
{

	public static void main(String[] args)
	{
		ZoneId paris = ZoneId.of("Europe/Paris");
		System.out.println(paris);
	}

}
