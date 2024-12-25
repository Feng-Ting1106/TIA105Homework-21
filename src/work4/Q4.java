package work4;

import java.util.Scanner;

public class Q4 {

//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數
	
	public static void main(String[] args) {
		int [][] staffMoney = { {25, 32, 8, 19, 27} , {2500, 800, 500, 1000, 1200} };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你要借多少錢");
		int bm = sc.nextInt();
		String s = "有錢可借的員工編號:";
		int sum = 0;
		for(int i = 0; i < staffMoney[1].length; i++) {
			if(bm <= staffMoney[1][i]) {
				s += staffMoney[0][i] + " ";
				sum++;
			}
		}
		System.out.println(s + "共" + sum +"人");
		
	}
}
