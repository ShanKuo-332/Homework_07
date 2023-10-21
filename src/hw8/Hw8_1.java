package hw8;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Iterator;
import java.lang.Number;

public class Hw8_1 {
	public static void main(String[] args) {
		
		// 請建立一個Collection物件並將以下資料加入：
		// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、
		// “Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
		
		List al = new ArrayList();
		al.add(new Integer(100));
		al.add(new Double(3.14));
		al.add(new Long(21L));
		al.add(new Short("100"));
		al.add(new Double(5.1));
		al.add("Kitty");
		al.add(new Integer(100));
		al.add(new Object());
		al.add("Snoopy");
		al.add(new BigInteger("1000"));
		
		
		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.print("使用Iterator: ");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		
		System.out.print("\n使用傳統for迴圈: ");
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + "  ");
		}
		
		System.out.print("\n使用foreach: ");
		for(Object o : al) {
			System.out.print(o + "  ");
		}
		
		
		// 移除不是java.lang.Number相關的物件
		Iterator it1 = al.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			if(!(o instanceof Number)) {
				it1.remove();    // 在foreach中或iterator時，不能修改集合，否則會出現 ConcurrentModificationException
			}
		}


		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		System.out.print("\n移除非Number相關的物件後: ");
		for(Object o : al) {
			System.out.print(o + "  ");
		}
		
		
	}
}
