import java.util.LinkedList;
import java.util.Queue;

public class D1_LinkedListQueue
{
	public static void main(String[] args)
	{
		Queue<String> que = new LinkedList<>();
		// 데이터 저장
		que.offer("BOY");
		que.offer("TOY");
		que.offer("Robot");
		//무엇이 다음에 나올지 확인
		System.out.println("next : " + que.peek()) ;
		// 찻반쩨. 두번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		//무엇이 다음에 나올지 확인
		System.out.println("next : " + que.peek());
		// 마지막 인스턴스 꺼내기
		System.out.println(que.poll());
	}

}
