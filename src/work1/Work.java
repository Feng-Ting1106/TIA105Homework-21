package work1;

public class Work {

	public static void main(String[] args) {

//		第一題:請設計一隻Java程式，計算12，6這兩個數值的和與積
		int ans1 = 12 + 6;
		int ans2 = 12 * 6;
		
		System.out.println("第一題答案為:" + ans1 +"、" + ans2);
		
//		第二題:請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200, eggDozen;
		eggDozen = egg / 12;
		egg = egg % eggDozen;
		
		System.out.println("第二題答案為:" + eggDozen + "打" + egg + "顆");
		
//		第三題:請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int secAns = 256559,  minAns, hourAns ,dayAns;
		int sec = 60, min = 60, hour = 24;
		dayAns = ((secAns /sec) /min) /hour;
		hourAns =((secAns /sec) /min) %hour;
		minAns = (secAns /sec) %min;
		secAns = secAns % sec;

		System.out.println("第三題答案為:" +dayAns +"天" +hourAns +"小時" +minAns +"分" +secAns +"秒");

//		第四題:請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長				
		final double PI = 3.1415;
		int radius = 5 ;
		double area = (radius * radius) * PI;
		double perimeter = (radius * 2) * PI;
		
		System.out.printf("第四題答案為:圓面積是%.2f ",area );
		System.out.printf("圓周長是%.2f %n"  ,perimeter );
		
//		第五題:某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後
//		本金加利息共有多少錢 (用複利計算，公式請自行google)
//		複利公式 = FV =PV(1+i)次方n
		int pv = 150 ,year =10 ;
		double rate = 0.02 , fv;
		fv =pv *(Math.pow(1 +rate ,year));
		System.out.printf("第五題答案為:%.2f" ,fv);
		System.out.println("萬元");
		
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5 、 5 + ‘5’ 、 5 + “5”  並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); 
		//兩個int值的相加，輸出結果為10 型別int
		
		System.out.println(5 + '5'); 
		//int與char的相加，char型別的值會先依Unicode字碼表轉換為int，然後再與int相加
		//'5'在Unicode字碼表中為53，實際運算為5+53  輸出結果為58 型別int		
		
		System.out.println(5 + "5"); 
		//int與String的文字串接，輸出結果為55 型別String
		
	}
}