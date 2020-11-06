import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E3_ObjectInput
{

	public static void main(String[] args)
	{
		try(ObjectInputStream oi = 
				new ObjectInputStream (new FileInputStream ("Object.bin")))
		{
			E1_SBox box1 = (E1_SBox) oi.readObject();
			System.out.println(box1.get());
			E1_SBox box2 = (E1_SBox) oi.readObject();
			System.out.println(box2.get());
		}catch(ClassNotFoundException e)
			{ e.printStackTrace(); }
		catch(IOException e)
		{ e.printStackTrace(); }
	}

}
