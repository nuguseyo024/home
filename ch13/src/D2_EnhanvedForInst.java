class Box
{
	private String contents;
	private int boxNum;
	
	Box(int num, String cont)
	{
		boxNum = num;
		contents = cont;
	}
	public int getBoxNum() {return boxNum;}
	public String toString() {return contents;}
}//은닉자 안에 있는 값 쓰려면 getter setter 쓰던가 생성자를 놔줘야함
class D2_EnhanvedForInst
{
	public static void main(String[] args)
	{
		Box[] ar = new Box[5];
		
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "computer");
		ar[2] = new Box(303, "apple");
		ar[3] = new Box(404, "dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		for(Box e : ar)
		{
//			if(e.getBoxNum() == 505)
				System.out.println(e);
		}
	}

}
