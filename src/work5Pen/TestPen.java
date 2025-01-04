package work5Pen;

public class TestPen {

	public static void main(String[] args) {
		Pen[] penArr = {new Pencil("利百代",10), new InkBrush()};
//		penArr[0].setBrand("利百代");
//		penArr[0].setPrice(10);
		penArr[1].setBrand("大利");
		penArr[1].setPrice(100);
		for(int i = 0; i < penArr.length; i++) {
			System.out.println(penArr[i].getPrice());
			penArr[i].wirte();
		}
	}
}
