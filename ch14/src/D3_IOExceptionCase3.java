import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D3_IOExceptionCase3
{

	public static void main(String[] args)
	{
		try {md1();}
		catch(IOException e) {e.printStackTrace();}
	}
	public static void md1() throws IOException //메서드의 throws절 선언을 통해 예외의 처리를 넘길 수 있음
	{
		md2();
	}
	public static void md2() throws IOException
	{
		Path file = Paths.get("D:\\junjin\\Java\\Study\\Simple.txt");
		BufferedWriter writer = null; 
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('Z');
		
		if(writer != null)
			writer.close();
	}

}
//IOException에 한해서 그냥 넘겨버리자
