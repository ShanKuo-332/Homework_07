package hw2;

public class Hw2 {
	public static void main(String[] args) {

		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i=2; i<=1000; i=i+2) {
			sum += i;
		}
		System.out.println("第一題");
		System.out.println("1~1000的偶數和 = " + sum);

		
		
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product1 = 1;
		for (int i=1; i<=10; i++) {
			product1 *= i;
		}
		System.out.println("\n第二題");
		System.out.println("1~10的連乘積 = " + product1);

		
		
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int product2 = 1;
		int n = 1;
		while (n <= 10) {
			product2 *= n;
			n++;
		}
		System.out.println("\n第三題");
		System.out.println("1~10的連乘積 = " + product2);
		
		
		
		// 請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		System.out.println("\n第四題");

		for (int i=1; i<=10; i++) {
			int square = (int) Math.pow(i, 2);
			System.out.print(square + " ");
		}
		
		
		
		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("\n\n第五題");
		int count = 0;
		for(int i=1; i<=49; i++) {
			if(i%10 == 4 || i > 39) {
				continue;
			}
			System.out.print(i+ "\t");
			
			count++;
			if(count%9 == 0) {
				System.out.println();
			}
		}
		
		
		
		// 請設計一隻Java程式,輸出結果為以下:
		/*
		   1 2 3 4 5 6 7 8 9 10 
		   1 2 3 4 5 6 7 8 9 
		   1 2 3 4 5 6 7 8 
		   1 2 3 4 5 6 7 
		   1 2 3 4 5 6 
		   1 2 3 4 5
		   1 2 3 4
		   1 2 3
		   1 2
		   1  
		 */
		System.out.println("\n\n第六題");
		
		for(int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		
		
		// 請設計一隻Java程式,輸出結果為以下:
		/*
			A
			BB
			CCC
			DDDD
			EEEEE
			FFFFFF
		 */
		System.out.println("\n第七題");
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				char ch = 64;         // A的char為65
				ch += i;
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
		
		
		
		// 課堂練習:使用不同的迴圈方法，輸出九九乘法表
		// 使用 for + while
		System.out.println("\n課堂練習:");
		System.out.println("使用 for + while 輸出九九乘法表");
		for(int i=1; i<=9; i++) {
			int j=1;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}
			System.out.println();
		}
		
		// 使用 for + do while
		System.out.println("\n使用 for + do while 輸出九九乘法表");
		for(int i=1; i<=9; i++) {
			int j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			System.out.println();
		}
		
		// 使用 while + do while
		System.out.println("\n使用 while + do while 輸出九九乘法表");
		int i=1;
		while(i<=9) {		
			int j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		}
		
		
	}
}
