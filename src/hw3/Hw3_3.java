package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hw3_3 {
	
	// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
	// 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數：
	// (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
	
	
//	// 方法一：透過Array.copy()產生可選的數字陣列
//	
//	public static void main(String[] args) {
//		int numHate, count = 0;
//
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		Scanner scn = new Scanner(System.in);
//		numHate = scn.nextInt();
//
//		System.out.println("\n下列為阿文可以選擇的號碼與總數");
//		int[] numAll = new int[49];
//		
//		for (int i = 1; i <= 49; i++) {
//			if (i % 10 == numHate || (i > 9 && i >= numHate * 10 && i < (numHate + 1) * 10)) {
//				continue;
//			}
//			System.out.print(i + "\t");
//			
//			numAll[count] = i;
//			count++;
//			
//			if (count % 6 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println("總共有" + count + "個數字可選");
//
//		System.out.println("\n電腦選號：從可選擇的號碼亂數印出6個且不重複");		
//		int[] numOption= Arrays.copyOfRange(numAll, 0 , count);
//		int[] numRandom = getRandom(count, numOption);
//		System.out.print(Arrays.toString(numRandom));
//		
//		scn.close();
//	}
//		
//	public static int[] getRandom (int count, int[] numOption) {
//		int[] numRandom = new int[6];
//		boolean[] used = new boolean[count];  // 用來註記是否重複
//		int index;                            // 陣列used的索引
//		
//		for(int i=0; i<numRandom.length; i++) {
//			do {
//				index = (int) (Math.random()*count);
//			} while (used[index] == true);
//				
//			numRandom[i] = numOption[index];;
//			used[index] = true;
//		}		
//		return numRandom;	
//	}

	

	// 方法二：用String類的方法排除不要的數字，設置動態陣列存放可選的數字
	
	public static void main(String[] args) {	
		int numHate, count = 0;
		
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner scn = new Scanner(System.in);	
		numHate = scn.nextInt();
		
		ArrayList<Integer> numOption = new ArrayList<Integer>();
		
		System.out.println("\n下列為阿文可以選擇的號碼與總數");
		for (int i = 1; i <= 49; i++) {
			if (String.valueOf(i).contains(String.valueOf(numHate)) ) {
				continue;
			}
			System.out.print(i + "\t");
			
			numOption.add(i);
			count++;
			
			if (count % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println("總共有" + count + "個數字可選");
		
		System.out.println("\n電腦選號：從可選擇的號碼亂數印出6個且不重複");
		int[] numRandom = getRandom(count, numOption);
		System.out.println(Arrays.toString(numRandom));

		scn.close();
	}
	
	public static int[] getRandom (int count, ArrayList<Integer> numOption) {
		int[] numRandom = new int[6];
		boolean[] used = new boolean[count];  // 用來註記是否重複
		int index;                            // 陣列used的索引
		
		for(int i=0; i<numRandom.length; i++) {
			do {
				index = (int) (Math.random()*count);
			} while (used[index] == true);
				
			numRandom[i] = numOption.get(index);;
			used[index] = true;
		}		
		return numRandom;	
	}
	
	
}
