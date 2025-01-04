package work5;

public class Q3 {
//	利用Overloading，設計兩個方法 int、double，可以找出二維陣列的最大值並回傳
	public int maxElement(int x[][]) {
		int max = 1 ;
		int maxarr[] = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			max = x[i][0];
			for(int y = 0; y < x[i].length; y++) {
				if(x[i][y] > max) {
					max = x[i][y];
				}
			}
			maxarr[i] = max;
		}
		for(int i = 0; i < maxarr.length; i++) {
			if(maxarr[i] > max) {
				max = maxarr[i];
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = 1 ;
		double maxarr[] = new double[x.length];
		for(int i = 0; i < x.length; i++) {
			max = x[i][0];
			for(int y = 0; y < x[i].length; y++) {
				if(x[i][y] > max) {
					max = x[i][y];
				}
			}
			maxarr[i] = max;
		}
		for(int i = 0; i < maxarr.length; i++) {
			if(maxarr[i] > max) {
				max = maxarr[i];
			}
		}
		return max;
	}
	public static void main(String[]args) {
		int aa[][] = {{1 ,2 ,6,7,8,500,101} , { 90,200,20,40,68,100,21}};
		double bb[][] = {{1 ,2 ,6,7,8,500.9,101} , { 90,2000.25,20,40,68,100,21}};
		Q3 q = new Q3();
		System.out.println(q.maxElement(bb));
		
	}
}
