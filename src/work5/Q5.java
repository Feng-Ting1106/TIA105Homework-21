package work5;
public class Q5 {
// 設計一個方法，會回傳8位數的驗證碼，驗證碼包含英文大小寫、數字的亂數組合

	public char[] genAuthCode() {
		char ac[] = new char[8]; 		//創建一個陣列儲存驗證碼
		for(int i = 0; i < ac.length; i++) {
			int x = (int)(Math.random()*62) ;  //亂數生成 0~61的數字(0~9 + A~Z + a~z共62個)
			if(x < 10) { 
				x += 48;  				//依照生成的亂數，0~9(數字)、10~35(A~Z)、36~61(a~z)
			}else if (x <36) {			//對照Unicode字元表的十進制代碼加上差值
				x += 55;
			}else {
				x += 61;
			}
			ac[i] = (char)x;          //將數字結果轉為char存入陣列中
		}
		return ac;
	}
	public static void main(String[] args) {
		Q5 q = new Q5();
		System.out.println("本次隨機產生的驗證碼為:");
		System.out.println(q.genAuthCode());
	}

}
