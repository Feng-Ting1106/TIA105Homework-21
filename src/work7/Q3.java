package work7;

import java.io.*;

public class Q3 {
	public void copyFile(String sourceFile, String finalFile) {
		try (
			BufferedReader br = new BufferedReader (new FileReader(sourceFile));		
			BufferedWriter bw = new BufferedWriter(new FileWriter(finalFile));
			){
			String line;
			while ((line = br.readLine())!= null) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("複製成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Q3 q3 = new Q3();
		q3.copyFile("C:\\JavaHomeWork\\Sample.txt", "C:\\JavaHomeWork\\Tes.txt");
	}
}
