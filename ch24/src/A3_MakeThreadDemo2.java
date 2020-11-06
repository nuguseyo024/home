
public class A3_MakeThreadDemo2
{
	public static void main(String[] args)
	{
		Runnable task = () -> 
		{
			try {Thread.sleep(3000);}
			//3초 기다리는 메소드
			catch(Exception e) {}
			
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};
		Thread t = new Thread(task);
		t.start();
		
		System.out.println("End " + Thread.currentThread().getName());
	}
}
