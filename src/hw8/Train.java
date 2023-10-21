package hw8;

import java.util.*;

// 請設計一個Train類別，並包含以下屬性：
// - 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
// - 目的地dest，型別為String - 票價price，型別為double
// 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Train() {
		
	}
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	// 一次輸出全部
	public String print() {
		return number + ", " + type + ", " + start + ", " + dest + ", "  + price;
	} 
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}	
		if(obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if(this.number == t.number && this.type.equals(t.type) && this.start.equals(t.start) && 
			   this.dest.equals(t.dest) && this.price == t.price) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + ((type == null) ? 0 : type.hashCode());
		result = result * prime + ((start == null) ? 0 : start.hashCode());
		result = result * prime + ((dest == null) ? 0 : start.hashCode());
		result = result * prime + (int)price;
		return result;
	}
	
	
	public int compareTo(Train train) {   // 以number由大到小
		if(this.number < train.number) {
			return 1;   // 右邊
		}else if(this.number == train.number) {
			return 0;
		}else {
			return -1;  // 左邊 
		}
	}
	
	
	
	public static void main(String[] args) {
		Train[] train= new Train[7];
		train[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		
		
		// 請寫一隻程式，能印出不重複的Train物件
		// (根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		Set<Train> set = new HashSet<Train>();
		for(int i=0; i<train.length; i++) {
			set.add(train[i]);
		}
		
		System.out.println("============= HashSet Iterator =============");
		Iterator<Train> it1 = set.iterator();
		while(it1.hasNext()) {
			Train t = (Train) it1.next();
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}
		
		System.out.println("============= HashSet for迴圈 =============");
		System.out.println("set集合沒有順序性，不能用傳統for迴圈取值");
		
		System.out.println("============= HashSet forEach =============");
		for(Train t : set) {
//			System.out.printf("%d, %s, %s, %s, %.0f%n", t.getNumber(), t.getType(), t.getStart(), t.getDest(), t.getPrice());
			System.out.println(t.print());
		}

				
		
		// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		// (根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		List<Train> list = new ArrayList<Train>();
		for(int i=0; i<train.length; i++) {
			list.add(train[i]);
		}
		
		Collections.sort(list);
		
		System.out.println("============= ArrayList Iterator =============");
		Iterator<Train> it2 = list.iterator();
		while(it2.hasNext()) {
			Train t= (Train) it2.next();
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}
		
		System.out.println("============= ArrayList for迴圈 =============");
		for(int i=0; i<list.size(); i++) {
			Train t = (Train) list.get(i);
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}
		
		System.out.println("============= ArrayList forEach =============");
		for(Train t : list) {
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}
		
		
		
		// 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		// (根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		Set<Train> set2 = new TreeSet<Train>();
		for(int i=0; i<train.length; i++) {
			set2.add(train[i]);
		}
		
		System.out.println("============= TreeSet Iterator =============");
		Iterator<Train> it3 = set2.iterator();
		while(it3.hasNext()) {
			Train t = (Train) it3.next();
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}

		System.out.println("============= TreeSet for迴圈 =============");
		System.out.println("set集合沒有順序性，不能用傳統for迴圈取值");

		System.out.println("============= TreeSet forEach =============");
		for(Train t : set2) {
//			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", "  + (int)t.getPrice());
			System.out.println(t.print());
		}
		

	}
}
