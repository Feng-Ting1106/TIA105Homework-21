package work6;

import java.util.Scanner;

public class Calculator {

	public void powerXY() {
		Scanner sc = new Scanner(System.in);
		int sum, x, y;

		verX: while (true) {
			System.out.println("請輸入x的值");
			try {
				x = sc.nextInt();
			} catch (Exception e) {
				System.out.println("x值的輸入格式不正確，請再輸入一次");
				sc.nextLine();
				continue verX;
			}
			verY: while (true) {
				System.out.println("請輸入y的值");
				try {
					y = sc.nextInt();
				} catch (Exception e) {
					System.out.println("y值的輸入格式不正確，請再輸入一次");
					sc.nextLine();
					continue verY;
				}
				break;
			}
			try {
				if (x == 0 && y == 0) {
					System.out.println("0的0次方沒有意義!");
					throw new CalException();
				} else if (y < 0) {
					System.out.println("次方為負值，結果回傳不為整數!");
					throw new CalException();
				} else {
					sum = (int) Math.pow(x, y);
					System.out.println(x + "的" + y + "次方等於" + sum);
				}
			} catch (CalException e) {
				continue verX;
			}
			break;
		}
	}
}
