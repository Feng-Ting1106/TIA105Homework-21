package work5;

import java.util.Scanner;

public class Q12 {
//	設計一個方法，使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public void starSquare(int width, int height) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		width = sc.nextInt();
		height = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int x = 0; x < width; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	設計一個方法，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		int arr[] = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
		}
		System.out.println("本次亂數結果為:");
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.println();
		System.out.println(sum / arr.length);
	}

	public static void main(String[] args) {
		Q12 q = new Q12();
		Object obj = new Object();
		q.starSquare(0, 0);
		q.randAvg();
	}
}
