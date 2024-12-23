package work3;

import java.util.Arrays;
import java.util.Scanner;

public class Work3 {

//	直角三角形判斷用方法，長邊平方等於另外兩邊平方和
	public static boolean rightTriamgle(int x, int y, int z) {
		return Math.pow(x, 2) == (Math.pow(y, 2) + Math.pow(z, 2));
	}

//	不想要的數字排除法
	public static boolean okNum(int number, int notLike) {

		return number != notLike && (number % 10) != notLike && (number / 10) != notLike;
	}

//	不與陣列內數字重複用方法  
	public static boolean noRepeat(int ranNumber, int number[]) {
		int y = 0;
		for (int x = 0; x < number.length; x++) {
			if (ranNumber == number[x]) {
				y++;
			}
		}
		return y == 0;
	}

	public static void main(String[] args) {
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
		Scanner sc = new Scanner(System.in);

//		System.out.println("請輸入三個整數:");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
//		if (x == 0 || x == 0 || z == 0) {
//			System.out.println("不是三角形");
//		} else if (x == y && y == z) {
//			System.out.println("正三角形");
//		} else if (rightTriamgle(x, y, z) || rightTriamgle(y, x, z) || rightTriamgle(z, x, y)) {
//			System.out.println("直角三角形");
//		} else if (x == y || x == z || y == z) {
//			System.out.println("等腰三角形");
//		} else {
//			System.out.println("其它三角形");
//		}

//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息
//		猜對則顯示正確訊息，如圖示結果：
//		進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
//		int a = (int) (Math.random() * 101);
//		System.out.println("請猜一個0~100的數字");
//		while (true) {
//			int b = sc.nextInt();
//			if (b == a) {
//				System.out.println("答對了! 答案就是" + b);
//				break;
//			} else if (b > a) {
//				System.out.println("猜太大了，再猜一次看看");
//			} else {
//				System.out.println("猜太小了，再猜一次看看");
//			}
//		}
//		搭配陣列改寫成終極密碼版，會直接顯示剩餘可能數字的範圍
//		int i = (int) (Math.random() * 101);
//		System.out.println("請猜一個0~100的數字");
//
//		int array[] = new int[3];
//		array[0] = 0;
//		array[1] = i;
//		array[2] = 100;
//		while (true) {
//			int j = sc.nextInt();
//			if (j > array[2] || j < array[0]) {
//				System.out.println("輸入的數字超出範圍，請重新輸入");
//			} else if (j == i) {
//				System.out.println("答對了! 答案就是" + j);
//				break;
//			} else if (j > i) {
//				array[2] = j;
//				System.out.println(array[0] + "~" + array[2]);
//			} else if (j < i) {
//				array[0] = j;
//				System.out.println(array[0] + "~" + array[2]);
//			}
//		}

		System.out.println("阿文 請輸入你不想有的數字(1~9)");
		int notLike;
		int finalNumber[] = new int[6];
		int sum = 0;
		notLike = sc.nextInt();
		for (int f = 1; f <= 49; f++) {
			if (okNum(f, notLike)) {
				System.out.print(f + "  ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("總共有" + sum + "個數字可選" + "\n");
		System.out.println("以下是電腦選號亂數印出的六組號碼");
		int ranNumber = 0;
		int c = 0;
		while (true) {
			ranNumber = (int) ((Math.random() * 49) + 1);
			if (okNum(ranNumber, notLike) && noRepeat(ranNumber, finalNumber)) {
				finalNumber[c] = ranNumber;
				c++;
			}
			if (finalNumber[5] != 0) {
				break;
			}
		}
		for (int d = 0; d < finalNumber.length; d++) {
			System.out.print(finalNumber[d] + " ");
		}
	}
}