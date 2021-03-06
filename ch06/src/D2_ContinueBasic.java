
public class D2_ContinueBasic
{

	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;
		
		while((num++) < 100) 
		{
			if(((num % 5) != 0) || ((num % 7) != 0)) // 나머지가 0이 아닌경우 true
				continue; //continue 찍고 다시 위로(while) 올려서 num++ 처리된다
			
			count++; //
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}

}
//조건에 부합되면 continue가 실행되고 
//부합안되면 continue를 안찍고 밑으로 내려가서 아래 내용을 실행

//반복의 횟수가 정해져 있으면 for문
//반복의 횟수가 안정해져 있으면 while문
