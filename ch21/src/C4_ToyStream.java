import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo 
{
	private String model;
	private int price;
	
	public ToyPriceInfo(String m, int p)
	{
		model = m;
		price = p;
	}
	public int getPrice() { return price; }
}
public class C4_ToyStream
{
	public static void main(String[] args)
	{
		List<ToyPriceInfo> ls  = new ArrayList<>();
		ls.add(new ToyPriceInfo("Gun_LR_45", 200));
		ls.add(new ToyPriceInfo("TEDDYT_BEAR_S_014", 350));
		ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 650));
		
		int sum = ls.stream()
					.filter(p -> p.getPrice() < 500)
					.mapToInt(t -> t.getPrice())
					.sum();
		System.out.println("sum = " + sum);
		
	}

}
