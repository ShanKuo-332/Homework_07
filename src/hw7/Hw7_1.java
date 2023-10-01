package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

// 請寫一個程式讀取Sample.txt檔案，並輸出以下訊息：
// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class Hw7_1 {
	public static void main(String[] args) throws IOException {
		File file = new File("File\\Sample.txt");
		
		int countChar = 0;
		int countLine = 0;
		
		
		// 讀一個字元
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int i; 
		while((i = br.read()) != -1) {
			countChar++;
		}
		
		br.close();
		fr.close();
		
		
		// 讀一列資料
		FileReader fr1 = new FileReader(file);
		BufferedReader br1 = new BufferedReader(fr1);
		String str;
		while((str = br1.readLine()) != null) {
			countLine++;
		}
		
		br1.close();
		fr1.close();

		
		System.out.println("Sample.txt檔案共有" + file.length() + "個位元組，"
		                    + countChar + "個字元，"+ countLine +"列資料");
		
	}
}
