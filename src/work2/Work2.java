package work2;

public class Work2 {

	public static void main(String[] args) {
//				請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum1 = 0;
		for (int i = 0; i <= 1000; i = i + 2) {
			sum1 += i;
		}
		System.out.println(sum1);

//				請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for (int y = 2; y <= 10; y++) {
			sum2 = sum2 * y;
		}
		System.out.println(sum2);

//				請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum3 = 1, x = 2;
		while (x < 11) {
			sum3 = sum3 * x;
			x = x + 1;
		}
		System.out.println(sum3);

//				請設計一隻Java程式，輸出結果為以下：
//				1 4 9 16 25 36 49 64 81 100
		int sum4 = 1;
		for (int z = 3; sum4 <= 100; z = z + 2) {
			System.out.print(sum4 + " ");
			sum4 = sum4 + z;
		}
		System.out.println();

//				阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//				輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int sum5 = 0;
		for (int a = 1; a <= 49; a++) {
			if (a != 4 && (a % 10) != 4 && (a / 10) != 4) {
				System.out.print(a + "  ");
				sum5++;
			}
		}
		System.out.println();
		System.out.println(sum5 + "個");

//				請設計一隻Java程式，輸出結果為1~10並逐行減少至只剩1
		for (int c = 10; c > 0; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}

//				請設計一隻Java程式，輸出結果為A BB CCC逐行增加到F
		char eng = ' ';
		for (int e = 1; e <= 6; e++) {
			for (int f = 1; f <= e; f++) {
				switch (e) {
				case 1:
					eng = 'A';
					break;
				case 2:
					eng = 'B';
					break;
				case 3:
					eng = 'C';
					break;
				case 4:
					eng = 'D';
					break;
				case 5:
					eng = 'E';
					break;
				case 6:
					eng = 'F';
					break;
				}
				System.out.print(eng);
			}
			System.out.println();
		}
	}
}
