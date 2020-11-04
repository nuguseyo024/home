import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class A2_Read7FromFile
{
	public static void main(String[] args)
	{
		try 
		{
			InputStream in = new FileInputStream("data.dat");
			int dat = in.read();
			in.close();
			
			System.out.println(dat);
			System.out.printf("%c", dat);
		}catch (IOException e) {e.printStackTrace();}
	}

}// ASCII 코드 65 = 'A'

 