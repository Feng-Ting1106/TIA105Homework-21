package work6;

public class Calculator {

	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			System.out.println("0的0次方沒有意義!");
			throw new CalException();
		} else if (y < 0) {
			System.out.println("次方為負值，結果回傳不為整數!");
			throw new CalException();
		} else {
			int sum = (int) Math.pow(x, y);
			return sum;
		}
	}
}
