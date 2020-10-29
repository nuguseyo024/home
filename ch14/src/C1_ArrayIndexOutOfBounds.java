
public class C1_ArrayIndexOutOfBounds
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3};          //index가 0 1 2
		for(int i = 0; i < 4; i++)		//근데    0 1 2 3 을 넣으려고 해서 범위를 초과했다는 오류 발생
			System.out.println(arr[i]);
	}
}
