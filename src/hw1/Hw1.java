package hw1;

public class Hw1 {
	public static void main(String[] args) {

		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 12, num2 = 6;

		System.out.println("第一題");
		System.out.println("12+6=" + (num1 + num2));
		System.out.println("12*6=" + (num1 * num2));

		
		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggAmount = 200;
		int eggDozen = eggAmount / 12;
		int eggExtra = eggAmount % 12;

		System.out.println("\n第二題");
		System.out.println(eggAmount + "顆蛋共是" + eggDozen + "打" + eggExtra + "顆");

		
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSec = 256559;

		int minute = 60; // 一分鐘的秒數
		int hour = minute * 60; // 一小時的秒數
		int day = hour * 24; // 一天的秒數

		System.out.println("\n第三題");
		System.out.printf("%d秒為%d天、%d小時、%d分與%d秒%n", totalSec, totalSec / day, totalSec % day / hour,
				totalSec % hour / minute, totalSec % minute);

		
		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double radius = 5;
		double area = PI * Math.pow(radius, 2);
		double circumference = 2 * PI * radius;

		System.out.println("\n第四題");
		System.out.printf("圓面積=%.2f", area);
		System.out.printf("%n圓周長=%.2f", circumference);

		
		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
		// 請用程式計算10年後,本金加利息共有多少錢?
		// 複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
		int principal = 150_0000;
		double rate = 0.02f;
		int period = 10;
		double amount = principal * Math.pow((1 + rate), period);

		System.out.println("\n\n第五題");
		System.out.printf("本利和=%.2f元", amount);

		
		// 請說明以下三個運算式輸出結果的邏輯
		System.out.println("\n\n第六題");
		System.out.println(5 + 5); // 兩個5都為整數，輸出結果為整數相加，因此會等於10。
		System.out.println(5 + '5'); // 第二個5為字元，根據Unicode編碼表5為0x35(16進位)，轉換為10進為等於53(3*16+5)，因此輸出結果會等於5。
		System.out.println(5 + "5"); // 第二個5為字串，輸出結果為數字和字串串接，因此會等於55。

	}
}
