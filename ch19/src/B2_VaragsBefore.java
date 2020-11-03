
public class B2_VaragsBefore
{
	public static void showAll(String... vargs)
	{
		System.out.println("LEN : " + vargs.length);
		
		for(String s : vargs)
			System.out.print(s + '\t');
		System.out.println();
	}
	public static void main(String[] args)
	{
		showAll(new String[] {"BOX"});
		showAll(new String[] {"BOX", "Toy"});
		showAll(new String[] {"BOX", "Toy", "Apple"});
	}

}
