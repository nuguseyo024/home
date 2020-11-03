import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class C5_CovertCollection
{
	public static void main(String[] args)
	{
		List<String> lst = Arrays.asList("Toy","Box","Box","Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		// 중복을 허용하는 List
		for(String s : list)
			System.out.print(s.toString() +'\t');
		System.out.println();
		HashSet<String> set = new HashSet<>(list);
		list = new ArrayList<>(set);
		// 중복을 허용하지 않는 Set
		for(String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}

}
