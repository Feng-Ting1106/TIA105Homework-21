package work4;

import java.util.Scanner;

public class Q5 {
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年、mm月、dd日，執行後會顯示是該年的第幾天
	Scanner sc = new Scanner(System.in);

	public int setYear() {
		while (true) {
			int year = sc.nextInt();
			if (year > 0) {
				return year;
			} else {
				System.out.println("年份不得低於0，請重新輸入");
			}
		}
	}
	public int setMonth() {
		while (true) {
			int month = sc.nextInt();
			if (month > 0 && month <= 12) {
				return month;
			} else {
				System.out.println("輸入的月份超出範圍，請重新輸入");
			}
		}
	}
	public int setDay(int year, int month) {
		int day, dayTotal;

		if (month == 2 && year % 4 == 0) {
			dayTotal = 29;
		} else if (month == 2) {
			dayTotal = 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			dayTotal = 30;
		} else {
			dayTotal = 31;
		}
		while (true) {
			day = sc.nextInt();
			if (day <= dayTotal && day > 0) {
				return day;
			} else {
				System.out.println("輸入的日期超出範圍，請重新輸入");
			}
		}
	}
	public static void main(String[] args) {
		Q5 q5set = new Q5();
		
		System.out.println("請輸入西元年份");
		int year = q5set.setYear();
		
		System.out.println("請輸入月份");
		int month = q5set.setMonth();
		
		System.out.println("請輸入日期");
		int day = q5set.setDay(year, month);
		int[] allDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		if (year %4 ==0) {
			allDay[2] = 29;
		}
		while(month-1 >= 0) {
			sum += allDay[month-1];
			month--;
		}
		sum += day;
		System.out.println("輸入的日期為該年第" + sum + "天");
	}
}
