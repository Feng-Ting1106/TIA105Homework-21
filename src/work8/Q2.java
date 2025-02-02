package work8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private Double price;

	public Train(int number, String type, String start, String dest, Double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number && Objects.equals(price, other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	
	public int compareTo(Train t) {
		if(this.number > t.number) {
			return 1;
		}else if(this.number < t.number){
			return -1;
		}else {
			return 0;
		}
	}
}

public class Q2 {

	public static void main(String[] args) {
		Train Train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400d);
		Train Train2 = new Train(1254, "區間", "屏東", "基隆", 700d);
		Train Train3 = new Train(118, "自強", "高雄", "台北", 500d);
		Train Train4 = new Train(1288, "區間", "新竹", "基隆", 400d);
		Train Train5 = new Train(122, "自強", "台中", "花蓮", 600d);
		Train Train6 = new Train(1222, "區間", "樹林", "七堵", 300d);
		Train Train7 = new Train(1254, "區間", "屏東", "基隆", 700d);

//		請寫一隻程式，能印出不重複的Train物件
		System.out.println("==========不重複==========");
		HashSet trainlist1 = new HashSet();
		trainlist1.add(Train1);
		trainlist1.add(Train2);
		trainlist1.add(Train3);
		trainlist1.add(Train4);
		trainlist1.add(Train5);
		trainlist1.add(Train6);
		trainlist1.add(Train7);
		
		Iterator iterator = trainlist1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==========由大到小且不重複==========");
//		請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出，還可以不重複印出Train物件
		TreeSet trainlist2 = new TreeSet();
		trainlist2.add(Train1);
		trainlist2.add(Train2);
		trainlist2.add(Train3);
		trainlist2.add(Train4);
		trainlist2.add(Train5);
		trainlist2.add(Train6);
		trainlist2.add(Train7);

		for (Object i : trainlist2) {
			System.out.println(i);
		}
	}
}
