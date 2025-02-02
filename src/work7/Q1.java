package work7;
import java.io.*;
public class Q1 {

	public static void main(String[] args) {
		File file = new File("C:\\JavaHomeWork\\Sample.txt");
		long byteCount = 0;
		int charCount = 0;
		int lineCount = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line ;
			while((line = br.readLine()) != null) {
				lineCount ++;
				charCount += line.length();
			}			
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		byteCount = file.length();
		
		System.out.println("Sample.txt檔案共有" + byteCount +"個位元組，" + charCount + "個字元，" + lineCount + "列資料");
		
	}

}
