import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		return s1.length() - s2.length();
	}
}
public class C4_ComparatorString
{
	public static void main(String[] args)
	{
		//TreeSet<String> tree = new TreeSet<>();  // <--알파벳 순 정렬(중복제거)
		TreeSet<String> tree = new TreeSet<>(new StringComparator()); //<--글자수 순 정렬(중복제거)
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");
		tree.add("Robot1");
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		
		System.out.println();
			
	}
	


}
