import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D5_StringReader
{

	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("src.txt")))
		{
			String str;
			while(true) 
			{
				str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		}catch(IOException e)
			{e.printStackTrace();}
	}

}
//int로 받으면 -1을 넣으면 되는데 
//string에는 마이너스를 넣을수가 없으니까 null을 넣어주는거야