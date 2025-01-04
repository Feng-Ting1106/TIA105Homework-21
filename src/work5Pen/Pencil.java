package work5Pen;

public class Pencil extends Pen {
	public Pencil(String brand, int price) {
		super(brand,price);
	}
	public Pencil() {
		super();
	}
	public void wirte() {
		System.out.println("削鉛筆再寫");
	}
	public int getPrice() {
		return (int)(super.getPrice() * 0.8);
	}

}
