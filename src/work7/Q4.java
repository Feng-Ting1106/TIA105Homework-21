package work7;

import java.io.*;

public class Q4 {

	public static void main(String[] args) {
		Dog mydog[] = { new Dog("d1"), new Dog("d2") };
		Cat mycat[] = { new Cat("c1"), new Cat("c1") };
		File data = new File("C:\\data");
		File file = new File("C:\\data\\Object.ser");
		if (file.exists()) {
			data.mkdir();
		}
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i = 0; i < mydog.length; i++) {
				oos.writeObject(mydog[i]);
			}
			for (int i = 0; i < mycat.length; i++) {
				oos.writeObject(mycat[i]);
			}
			fos.close();
			oos.close();
			System.out.println("寫入成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
