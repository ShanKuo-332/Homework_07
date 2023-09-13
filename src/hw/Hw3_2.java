package hw;

import java.util.Scanner;

public class Hw3_2 {
	
	// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息:
	// (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numRandom = (int) (Math.random()*101);
		int numGuess;
		int max = 100, min = 0;
		
		System.out.println("開始猜數字吧");		
		
		while (true) {
			numGuess = scn.nextInt();
			
			if(isGuessAgain(numGuess, max, min)) {   // 防呆
				continue;
			}
			
			if(numRandom == numGuess) {
				System.out.println("答對了！答案就是" + numRandom);
				break;
			}else {
				if(numRandom > numGuess) {
					min = numGuess;
				}else {
					max = numGuess;
				}
				System.out.println("猜錯囉！　(提示:" + min + "~" + max + ")");
			}
		
		}
		scn.close();
	}
	
	
	public static boolean isGuessAgain(int numGuess, int max, int min) {
		if(numGuess <= min || numGuess >= max) {
			System.out.println("您猜的數字不再範圍內，請重猜，謝謝");
			return true;
		}
		return false;
	}

}
