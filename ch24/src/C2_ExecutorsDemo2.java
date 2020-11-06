import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C2_ExecutorsDemo2
{
	public static void main(String[] args)
	{
		Runnable task1 = () ->
		{
			String name =Thread.currentThread().getName();
			System.out.println(name + " : " + (5 + 7));
		};
		Runnable task2 = () ->
		{
			String name =Thread.currentThread().getName();
			System.out.println(name + " : " + (7 - 5));
		};
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		exr.submit(()-> 
		{
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 * 7));
		});
	}
}
// >> newFixedThreadPool <<
// 풀 안에 인자로 전달된 수의 쓰레드를 생성하고 유지한다.
// 초기 쓰레드 개수는 0개, 코어 쓰레드 수와 최대 쓰레드 수는 매개변수 nThreads값으로 지정.
// 만약 생성된 쓰레드가 놀고 있어도 쓰레드를 제거하지 않고 내버려 둔다.
