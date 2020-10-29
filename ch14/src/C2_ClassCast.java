class Board{}
class PBoard extends Board{}
public class C2_ClassCast
{
	public static void main(String[] args)
	{
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;  	// OK!
		
		System.out.println(". . intermediate location . . ");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1;		// Exception!
		// class Board cannot be cast to class PBoard 
	}

}
//자식이 더 크니까.. 자식이 부모로 형변환은 가능 
//부모는 자식으로 형변환 불가

