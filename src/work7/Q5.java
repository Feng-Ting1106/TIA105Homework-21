package work7;

import java.io.*;

public class Q5 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				Object obj = ois.readObject();
				if (obj instanceof Dog) {
					((Dog) obj).speak();
				}
				if (obj instanceof Cat) {
					((Cat) obj).speak();
				}
				System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println("讀取完畢");
		} finally {
			ois.close();
			fis.close();
		}

	}

}
