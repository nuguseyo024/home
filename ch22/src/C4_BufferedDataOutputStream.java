import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C4_BufferedDataOutputStream
{

	public static void main(String[] args)
	{
		try(DataOutputStream out = new DataOutputStream
				(new  BufferedOutputStream(new FileOutputStream("data.dat"))))
		{
			out.writeInt(370);
			out.flush();  	//버퍼에 데이터가 다 차지 않아도 출력
			out.writeDouble(3.14);
			
		}
		catch(IOException e) { e.printStackTrace(); }
	}
}
