package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		
		//1.
		// 有個一維陣列:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] num = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(num);
		int min = num[0];
		int max = num[num.length - 1];
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
		// 2.
		// 請建立一個字串,經過程式執行後,輸入結果是反過來的
		// 例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		char[] SArray = s.toCharArray(); 
		
		for(int i=0; i<SArray.length; i++) {
			for(int j=0; j<i; j++) {
				char temp = SArray[i];
				SArray[i] = SArray[j];
				SArray[j] = temp;
			}
		}
				
		for(int i=0; i<SArray.length; i++) {
			System.out.print(SArray[i]);
		}
		
//		for(char i : SArray) {
//			System.out.print(i);
//		}
		
		
		
		// 3.
		// 有個字串陣列如下 (八大行星):
		// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] s1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}; 
		String s2 = "";
		
		for(int i=0; i<s1.length; i++) {
			s2 += s1[i];
		}
		
//		for (String i : s1) {
//			s2 += i;
//		}
		
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		int[] countVowel = new int[5];   //儲存{a, e, i, o, u}的數量
		
		for(int i=0; i<s2.length(); i++) {
			for(int j=0; j<vowel.length; j++) {
				if(s2.charAt(i) == vowel[j]) {
					countVowel[j]++;
				}
			}
		}
		System.out.println("\n{a, e, i, o, u} 的數量 = " + Arrays.toString(countVowel));

		
		
		// 4.
		// 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
		// - 員工編號  25    32   8    19    27
		// - 身上現金  2500  800  500  1000  1200 
		// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:
		// 例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入欲借的金額");
		int borrow = scn.nextInt();
		
		int[][] lendder = { {25,2500}, {32,800}, {8,500}, {19,1000}, {27,1200} };
		int countEmp = 0;   // 可借錢的同事人數
		
		System.out.print("有錢可借的員工編號: ");
		for(int i=0; i<lendder.length; i++) {
			if (lendder[i][1] >= borrow) {
				countEmp++;
				System.out.print(lendder[i][0] + "  ");
			}
		}
		System.out.printf("共%d人\n",countEmp);
		
		scn.close();
		
		

		// 5.
		// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
		// 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		// (提示1:Scanner,陣列)
		// (提示2:需將閏年條件加入)
		// (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入 西元yyyy年 mm月 dd日 三個數字");
		int year, month, day;
		int countDay = 0;
		int[] dmonth = {31,28,31,30,31,30,31,31,30,31,30,31};  // 各月天數 (先預設非閏年)
		
		//防呆
		while(true) {
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
			
			if(dateRule(year, month, day, dmonth)) {
			break;
			}
			System.out.println("輸入日期格是有誤，請重新輸入");
		}
		
		for(int i=1; i<month; i++) {       
			countDay += dmonth[i-1];
		}
		countDay += day;
		
		// 若當年度為閏年，天數加一天
		// 閏年條件為：1.可被4整除且不為100整除者為閏年。
		//		    2.可被400整除為閏年。
		//		    3.可被1000整除為閏年。
		if(month > 2) {
			if(year%4 == 0 && year%100 != 0) {
				countDay += 1; 
			}else if(year%400 ==0 || year %1000 == 0){
				countDay += 1; 
			}
		}
		System.out.println("輸入的日期為該年第" + countDay + "天");		
		
		sc.close();
		
		
		
		// 6.
		// 班上有8位同學,他們進行了6次考試，請算出每位同學考最高分的次數:
		int[][] score = {{10, 35, 40, 100, 90, 85, 75,70},   //column為小考，row為學號
				   		 {37, 75, 77, 89, 64, 75, 70, 95},
				   		 {100, 70, 79, 90, 75, 70, 79 ,90},
				   		 {77, 95, 70, 89, 60, 75, 85, 89},
				   		 {98, 70, 89, 90, 75, 90, 89, 90},
				   		 {90, 80, 100, 75, 50, 20, 99, 75}};
		
		int[] count = new int[8];     //計算8位同學的最高分次數的陣列
		int[] maxScore = new int[6];
		
		for(int i=0; i<score.length; i++) {
			int index = 0;
			for(int j=0; j<score[i].length; j++) {
				if(score[i][j] >= maxScore[i]) {
					maxScore[i] =  score[i][j];					
					index = j;
				}
			}
			count[index] ++;
		}
		
		System.out.print("最高分次數: ");
		int studentID= 1;
		for(int i : count) {
			System.out.printf("第%d位%d次  ",studentID++ , i);
		}
		
		
	}
	
	
	
	// 4.
	// 防呆:year>0、month=1~12、day<=dmonth對應的天數 (非閏年時，day輸入29，此規則無法判斷有錯誤)
	public static boolean dateRule (int year, int month, int day, int[] dmonth) {
		if(year<0) {
			return false;
		}else if(month<1 || month>12) {
			return false;
		}else if(month !=2 && day > dmonth[month-1]) {
			return false;
		}else if(month ==2 && day > 29) {
			return false;
		}
		return true;
	}
	
}
