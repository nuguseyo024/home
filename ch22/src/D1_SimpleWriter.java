import java.io.FileWriter;
import java.io.Writer;

public class D1_SimpleWriter
{

	public static void main(String[] args)
	{
		try(Writer out = new FileWriter("data.txt"))
		 	{
				out.write('A');
				out.write('한');
				out.write('\n'+ "집가고싶다");
			}catch(Exception e)
				{e.printStackTrace();}
	}

}
