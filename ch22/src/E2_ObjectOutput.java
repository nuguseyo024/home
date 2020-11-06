import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E2_ObjectOutput
{

	public static void main(String[] args)
	{
		E1_SBox box1 = new E1_SBox("ROBOT");
		E1_SBox box2 = new E1_SBox("STRABERRY");		
		
		try(ObjectOutputStream oo = 
				new ObjectOutputStream (new FileOutputStream("Object.bin")))
			{
				oo.writeObject(box1);
				oo.writeObject(box2);
			}catch(IOException e)
			{ e.printStackTrace(); }
	}

}
