
public class D1_EnhancedFor
{
	public static void main(String[] args)
	{
		int[] ar = {1, 2, 3, 4, 5};		//1, 2, 3, 4, 5로 초기화
		
		for(int e : ar) 		//ar에 있는걸 다 꺼내서 츰부터 끝까지 int e에다가 넣어주겠다
			System.out.print(e + "  "); // 배열 요소 전체를 출력
		
		System.out.println(); //줄바꿈 용
		
		int sum = 0;
		
		for(int e : ar)
			sum += e; // 배열 요소의 전체 합 구하기
		
		System.out.println(" sum : " + sum);
		
	}
}
