package work2;

public class NineNine {

	public static void main(String[] args) {
//		for+while 九九乘法表
		for(int j = 1; j < 10; j++) {
			int k = 1;
			while( k < 10) {
				System.out.print(j + "x" + k + "=" + j*k + "  ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
//		for + do while 九九乘法表
		for(int j = 1; j < 10; j++) {
			int k = 1;
			do  {
				System.out.print(j + "x" + k + "=" + j*k + "  ");
				k++;
			}while( k < 10);
			System.out.println();
		}
		System.out.println();
//		while + do while 九九乘法表
		int j = 1;
		while(j < 10) {
			int k = 1;
			do  {
				System.out.print(j + "x" + k + "=" + j*k + "  ");
				k++;
			}while( k < 10);
			j++;
			System.out.println();
		}
	}

}
