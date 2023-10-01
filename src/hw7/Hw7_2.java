package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.PrintStream;

// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
// (請使用append功能讓每次執行結果都能被保存起來)

public class Hw7_2 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("File\\Data.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		
		for(int i=0; i<10; i++) {
			int num = (int) (Math.random()*1000 + 1);
			ps.println(num);
			
//			bos.write(num);    //輸出位元組，會是亂碼
		}
		
		ps.close();
		bos.close();
		fos.close();
		
	}
}
