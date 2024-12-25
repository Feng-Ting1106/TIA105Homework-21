package work4;

public class Q123 {

	public static void main(String[] args) {
//		有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

		int arr[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int aver = sum / arr.length;
		System.out.println("平均值為" + aver);
		System.out.print("大於平均值的有:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > aver) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n");
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Hello World";
		for (int i = (s.length() - 1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("\n");
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum2 = 0; 
		for(int i = 0; i < planets.length; i++) {
			for(int x = 0; x < planets[i].length(); x++) {
				if (planets[i].charAt(x) == 'a' || planets[i].charAt(x) == 'e'|| planets[i].charAt(x) == 'i' ||  planets[i].charAt(x) == 'o' || planets[i].charAt(x) == 'u'){
					sum2++;
				}
			}
		}
		System.out.println("共有" + sum2 +"個母音");
	}
}
