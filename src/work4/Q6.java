	package work4;

public class Q6 {
	
//	班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int [][] score = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
				};
		int []stuTop = new int[8]; //計算考最高分同學次數用陣列
		
		//用迴圈+陣列取成績出來逐個比大小，第一層迴圈為考試次數，第二層迴圈為每次考試的成績比大小
		//如果y的成績比較高 則x++，反之y++  最終x會停在成績最高的，y則會一路+到超出for迴圈限制而結束第二層迴圈。
		for(int i = 0; i < score.length; i++) {
			int x = 0;
			for(int y = 0; y < score[i].length;) {  
				if(score[i][y] > score[i][x] ) {	
					x++;
				}else {
					y++;
				}
			}
			stuTop[x]++;   //x停在最高分的學生後，在計算最高分同學的陣列裡幫該同學的最高分次數+1
		}
		//最後透過迴圈將結果印出來
		for(int z = 0; z < stuTop.length; z++) {
			System.out.println(z+1 + "號考最高分" + stuTop[z] + "次");
		}
	}
}

