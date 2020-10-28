import java.util.Arrays;

public class B_ArrayUtils
{

	public static void main(String[] args)
	{
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		//배열 ar1을 7로 초기화
		Arrays.fill(ar1,  7);
		//Arrays 클래스에 정의되어 있는 fill 메소드 사용
		//두번째 위치한 값으로 배열을 초기화
		
		//배열 ar1을 ar2로 부분 복사
		System.arraycopy(ar1, 0, ar2, 3, 4);
		//system 클래스에 정의된 arraycopy 메소드 사용
		//ar1 : 복사할 원본 배열
		//  0 : 배열의 0번째 값을 복사
		//ar2 : 복사한 값을 넣을 대상 배열
		//  3 : 3번째 자리부터 복사한 값 입력
		//  4 : 복사할 요소의 갯수
		
		
		for(int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + "  ");
		System.out.println();
		for(int i = 0; i < ar2.length; i++)
			System.out.print(ar2[i] + "  ");

	}

}
