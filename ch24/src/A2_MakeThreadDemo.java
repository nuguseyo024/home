class Task extends Thread 
{	//1단계 : Thread를 상속하는 클래스의 정의와 인스턴스 생성
	public void run()
	{
		int num = 30;
		String name = Thread.currentThread().getName();
		for(int i = 0; i < num; i++)
			{ System.out.println(name + " : " + i); }
	}
}
public class A2_MakeThreadDemo
{
	public static void main(String[] args)
	{	//2단계 : Thread 의 start 메소드 호출
		Task t1 = new Task();
		Task t2 = new Task();
		
		t1.start();
		t2.start();
		
		System.out.println("End " + Thread.currentThread().getName());
	}
}
