package hw;

import java.util.Scanner;

public class Hw5_1To3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("第一題");
		System.out.println("請輸入寬與高；");
		int width = scn.nextInt();
		int height = scn.nextInt();
		starSquare(width, height);

		System.out.println("\n第二題");
		randAvg();
		
		System.out.println("\n第三題");
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
		scn.close();
	}
	
	
	
	// 請設計一個方法為starSquare(int width, int height)，
	// 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形：
	public static void starSquare(int width, int height) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	
		
	// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中
	// 取平均值並印出這10個亂數與平均值：
	public static void randAvg() {
		double sum = 0;
		
		System.out.print("10個亂數：");
		for(int i=0; i<10; i++) {
			int num = (int) (Math.random()*101);
			System.out.print(num + "  ");
			sum += num;
		}
		double avg = sum/10;
		System.out.println("平均值：" + avg);
	}
}

		
	
	// 利用Overloading，設計兩個方法
	// int maxElement(int x[][]) 與 double maxElement(double x[][])，
	// 可以找出二維陣列的最大值並回傳：

	class Work03 {
		public int maxElement(int x[][]) {
			int max = x[0][0];
			
			for(int i=0; i<x.length; i++) {
				for(int j=0; j<x[i].length; j++) {
					if(x[i][j] > max) {
						max = x[i][j];
					}
				}
			}
			return max;
		}
		
		public double maxElement(double x[][]) {
			double max = x[0][0];
			
			for(int i=0; i<x.length; i++) {
				for(int j=0; j<x[i].length; j++) {
					if(x[i][j] > max) {
						max = x[i][j];
					}
				}
			}
			return max;
		}
	}
		
		
		
		

