package work5Pen;

public class InkBrush extends Pen {
	
	public InkBrush(String brand, int price) {
		super(brand,price);
	}
	public InkBrush() {
		super();
	}
	public void wirte() {
		System.out.println("沾墨汁再寫");
	}
	public int getPrice() {
		return (int)(super.getPrice() * 0.9);
	}

}
