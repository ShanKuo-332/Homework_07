package hw;

// 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
// 請設計一個方法 genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
// 此驗證碼內容包含了英文大小寫與數字的亂數組合：

public class Hw5_5 {
	
	public static void genAuthCode() {
		char[] ch = new char[62];   // 英文大小寫與數字共 26*2+10=62
		
		// unicode編碼表中：0~9的十進位為48~57、A~Z的十進位為65~90、a~z的十進位為97~122
		int count = 0;
		for(int i=48; i<=122; i++) {
			if((i>57 && i<65) || (i>90 && i<97)) {
				continue;
			}
			ch[count] = (char) i ;   // 為什麼要強制轉型(?   
			count++;
		}
		
		System.out.println("本次隨機產生驗證碼為：");
		for(int i=1; i<=8; i++) {
			int index = (int)(Math.random()*62);
			System.out.print(ch[index]);
		}
	}
	
	public static void main(String[] args) {
		genAuthCode();	
	}
	
}
