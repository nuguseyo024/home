import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class C5_SyncArrayList
{
	public static List<Integer> lst = new ArrayList<Integer>();
	public static void main(String[] args)throws InterruptedException
	{
		for(int i = 0; i< 16; i++)
			lst.add(i);
		System.out.println(lst);
		
		Runnable task = () -> 
		{
			synchronized(lst) 
			{
				ListIterator<Integer> itr = lst.listIterator();
				
				while(itr.hasNext())
					itr.set(itr.next() + 1);
				// System.out.println(lst);
			}
		};
		ExecutorService exr = Executors.newFixedThreadPool(3);
		exr.submit(task);
		exr.submit(task);
		exr.submit(task);
		
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(lst);
	}

}
