class Counter2
{
	private int count = 0;
	synchronized public void increment() { count++; }
	synchronized public void decrement() { count--; }
	public int getCount() { return count; }
}
public class B2_MutualAccessSyncMethod
{
	public static Counter2 cnt = new Counter2();
	public static void main(String[] args)throws InterruptedException
	{
		Runnable task1 = () -> {for(int i = 0; i< 1000; i++)cnt.increment();};
		Runnable task2 = () -> {for(int i = 0; i< 1000; i++)cnt.decrement();};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join(); //t1 이 참조하는 Thread의 종료를 기다림
		t2.join(); //t2 가 참조하는 Thread의 종료를 기다림
		
		System.out.println(cnt.getCount());
		// Thread가 종료되면 출력을 진행. 위 join의 영향
	}

}
