interface Viewable2 
{
	@Deprecated			
	// 문제의 발생 소지가 있거나 개선된 기능의 다른 것으로 대체되어서
	// 더이상 필요 없게 되었음을 뜻함
	// 따라서 아직은 호환성 유지를 위해서 존재하지만 
	// 이후에 사라질 수 있는 클래스 또는 메서드를 가리켜 
	// Deprecated 되었다고 한다.
	// 메서드마다 하나씩만 지정 가능
	public void showIt(String str); 
	public void brshowIt(String str);
}
class Viewer2 implements Viewable2
{
	@Override
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
public class C2_AtDeprecated
{
	public static void main(String[] args)
	{
		Viewable2 view = new Viewer2();
		view.showIt("Hello Annotations");
		view.brshowIt("Hello Annotations");
	}

}
