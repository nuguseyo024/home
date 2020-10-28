class Book{
	void printStatus() 
	{
		System.out.println("aaaaa");
	}
}
public class MemoryTest
{

	public static void main(String[] args)
	{
		Book bk = new Book();
		bk.printStatus();
		bk = null;
		
		int numA = 5;
		int numB = 2;
		int myResult = addTwoNum(numA, numB);
		System.out.println(myResult);
	}
	
	public static int addTwoNum(int num1, int num2)
	{
		int numX = num1;
		int numY = num2;
		int result = numX + numY;
		return result;
	}

}
