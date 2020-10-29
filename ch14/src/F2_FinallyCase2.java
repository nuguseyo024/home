import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F2_FinallyCase2
{

	public static void main(String[] args)
	{
		Path file = Paths.get("D:\\junjin\\Java\\Study\\Simple.txt");
		BufferedWriter writer = null; 
		try 
		{
			writer = Files.newBufferedWriter(file);
			
			writer.write('A');
			writer.write('Z');
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
		finally 
		{
			try 
			{
				if(writer != null)
					writer.close();   // 이 if를 쓰려고..
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}
		

		
	}
}
