import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C1_ExecutorsDemo
{

	public static void main(String[] args)
	{
		Runnable task = () -> 
		{
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};
		ExecutorService exr = Executors.newSingleThreadExecutor();
		exr.submit(task);
		
		System.out.println("End " + Thread.currentThread().getName());
		
		exr.shutdown();
		
	}
}
// >> newSingleThreadExcutor <<
// 풀 안에 하나의 쓰레드만 생성하고 유지한다.
// 쓰레드의 숫자가 단지 하나이고 하나의 태스크가 완료된 이후에 다음 태스크가 실행된다.
// 이것을 사용하면 동기화를 고려해야 할 필요 없이, 즉 synchronized를 사용하지 않고도
// 안전하게 실행할 수 있다.