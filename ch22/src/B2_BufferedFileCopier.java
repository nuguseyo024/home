import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class B2_BufferedFileCopier
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 : " );
		String src = sc.nextLine();
		
		System.out.print("사본 이름 : " );
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst))
		{
			byte buf[] = new byte[1024];
			int len;
			
			Instant start = Instant.now();
			while(true) 
			{
				len = in.read(buf);
				
				if(len == -1)
					break;
				out.write(buf, 0 ,len);
			}
			Instant end = Instant.now();
			System.out.println("Sequential Processing Time : " + 
			                    Duration.between(start, end).toMillis());
		}
		catch(IOException e) { e.printStackTrace(); }
	}

}
