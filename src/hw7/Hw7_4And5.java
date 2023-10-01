package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

// 4.
// 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
// 注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

// 5.
// 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多型簡化本題的程式設計)

public class Hw7_4And5  {
	public static void main(String[] args) throws Exception {
		Pets[] pet = new Pets[4]; 
		pet[0] = new Dog("阿狗");
		pet[1] = new Dog("小狗");
		pet[2] = new Cat("阿貓");
		pet[3] = new Cat("小貓");
		
		File file = new File("C:\\data\\Object.ser");
		
		File dir = new File(file.getParent());
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		// 輸出
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i=0; i<pet.length; i++) {
			oos.writeObject(pet[i]);
		}
		
		oos.close();
		fos.close();
		
		// 輸入 (檢查序列化是否成功)
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(file.getName() + "檔案內容如下: ");
		
		try {
			while(true) {
				((Pets) ois.readObject() ).speak();
			}
		}catch(EOFException e) {  // 輸入期間到達檔案結尾或串流結尾的Exception。
			System.out.println("資料已讀取完畢");
		}

		ois.close();
		fis.close();
		
	}
}
