interface Viewable3
{
	@Deprecated			
	public void showIt(String str); 
	public void brshowIt(String str);
}
class Viewer3 implements Viewable3
{
	@Override
	@SuppressWarnings("deprecation")
	// 프롬프트 창에서 deprecation 관련 경고 메세지를 생략하라는 의미
	public void showIt(String str)
	{
		System.out.println(str);	
	}
	@Override
	public void brshowIt(String str)
	{
		System.out.println('[' + str + ']');
	}
}
public class C3_AtSupressWarnings
{
	public static void main(String[] args)
	{
		Viewable3 view = new Viewer3();
		view.showIt("Hello Annotations");
		view.brshowIt("Hello Annotations");
	}

}
