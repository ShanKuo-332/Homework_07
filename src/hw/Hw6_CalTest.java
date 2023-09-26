package hw;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hw6_CalTest {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=0, y=0;
		boolean isException = false;
		
		while(true) {
			isException = false;
			
			try {
				System.out.println("請輸入 x 的值");
				x = scn.nextInt();
				System.out.println("請輸入 y 的值");
				y = scn.nextInt();
			} catch(InputMismatchException e){
				System.out.println("輸入格式不正確");
				scn.next();     // 可清除緩衝區中的無效輸入
				continue;
			}
			
			
			Hw6_Calculator cal = new Hw6_Calculator();
			try {
				int result = cal.powerXY (x, y);
				System.out.printf("%d的%d次方等於%d", x, y, result);
			}catch (Hw6_CalException c) {
				System.out.println(c.getMessage());
				isException = true;
			}
			
			if(!isException) {
				break;
			}
		}
		
		scn.close();	
	}
}
