import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;


public class D2_IOExceptionCase2
{

	public static void main(String[] args)
	{
		Path file = Paths.get("D:\\junjin\\Java\\Study\\Simple.txt");
		//\하나만 쓰면 특수문자인줄 알잖아 그래서 두개 써줌
		BufferedWriter writer = null; 
		//static 메서드예요
		try 
		{
			writer = Files.newBufferedWriter(file);
			
			writer.write('A');
			writer.write('Z');
			//파일 사이즈가 커져서 에러 발생 가능성 있을유 (없을수도 있는데~)
			
			if(writer != null)
				writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}
}




