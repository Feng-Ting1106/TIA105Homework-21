package work6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator myCal = new Calculator();
		int x , y;

		testCal: while (true) {
			System.out.println("請輸入x的值");
			try {
				x = sc.nextInt();
			} catch (Exception e) {
				System.out.println("輸入格式不正確，請再輸入一次");
				sc.nextLine();
				continue testCal;
			}
			verY: while (true) {
				System.out.println("請輸入y的值");
				try {
					y = sc.nextInt();
				} catch (Exception e) {
					System.out.println("輸入格式不正確，請再輸入一次");
					sc.nextLine();
					continue verY;
				}
				break;
			}
			try {
				System.out.println(myCal.powerXY(x, y));
			} catch (CalException e) {
				continue testCal;
			}
			break;
		}
		sc.close();
	}

}
