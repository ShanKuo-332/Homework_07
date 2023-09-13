package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
	
	// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形:
	// 是三角形的規則:任兩邊長的和>第三邊，且邊長大於0
	// (進階功能:加入直角三角形的判斷)
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		int i1 = scn.nextInt();
		int i2 = scn.nextInt();
		int i3 = scn.nextInt();
		
		int[] side = {i1, i2, i3};
		Arrays.sort(side);    //排序後，邊長由小到大為 side[0] <= side[1] <= side[2]
		
		if(side[0] + side[1] <= side[2] || side[0] <= 0) {
			System.out.println("不是三角形");
		}else if(side[0] == side[1] && side[1] == side[2]) {
			System.out.println("正三角形");
		}else if(side[0] == side[1] || side[1] == side[2]) {
			System.out.println("等腰三角形");
		}else if(Math.pow(side[0],2) + Math.pow(side[1],2) == Math.pow(side[2],2)) {
			System.out.println("直角三角形");
		}else {
			System.out.println("其它三角形");
		}
		
		scn.close();
	}
}
