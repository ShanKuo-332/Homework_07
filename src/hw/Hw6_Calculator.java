package hw;

import java.lang.Math;

// 請設計三個類別Calculator.java，CalException.java與CalTest.java，
// 在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
// CalTest.java執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
// 1. x與y同時為0，(產生自訂的CalException例外物件)
// 2. y為負值，而導致x的y次方結果不為整數
// 3. x與y皆正確情況下，會顯示運算後結果

public class Hw6_Calculator {

	public int powerXY (int x, int y) throws Hw6_CalException {
		if(x==0 && y==0) {
			throw new Hw6_CalException("0的0次方沒有意義!");
		}else if(y<0) {
			throw new Hw6_CalException("次方為負值，結果回傳不為整數!");
		}else {
			return (int) Math.pow(x, y);
		}
		
	}
}
