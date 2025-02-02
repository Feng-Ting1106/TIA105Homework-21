package work7;

import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		String fileName = "C:\\JavaHomeWork\\Data.txt";
		int data[] = new int[10];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 1000) + 1;
		}
		try {
			FileOutputStream fos = new FileOutputStream(fileName, true);
			PrintStream ps = new PrintStream(fos);
			for(int i = 0; i < data.length ; i++) {
				ps.print(data[i] + "  ");
			}
			ps.println();
			ps.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
