package hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
//import java.io.PrintWriter;

// 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
// 呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class Hw7_3 {
	
	public static void copyFile(File f1, File f2) {
		try{
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			int i;
			while((i = br.read()) != -1) {
				bw.write(i);
			}
			
//			PrintWriter pw = new PrintWriter(bw);
//			
//			String str;
//			while((str = br.readLine()) != null) {
//				pw.println(str);
//			}
			
//			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		File f1 = new File("File\\copyInput.txt");
		File f2 = new File("File\\copyOutput.txt");
		
		copyFile(f1, f2);
		
	}
}
