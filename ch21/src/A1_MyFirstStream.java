import java.util.Arrays;
import java.util.stream.IntStream;

public class A1_MyFirstStream
{
	public static void main(String[] args)
	{
		int[] ar = {1, 2, 3, 4, 5};
		
		//스트림 생성
		IntStream stm1 = Arrays.stream(ar);
		//중간 파이프 구성
		IntStream stm2 = stm1.filter(n -> n%2 ==1); //배열 안의 숫자 중 홀수인 것만 걸러냄
		//최종 파이프 구성	
		int sum = stm2.sum(); //위에서 걸러진 숫자들만 더함
		
		System.out.println(sum);
	}
}	//filter 는 true인 것만 걸러내는 역할
