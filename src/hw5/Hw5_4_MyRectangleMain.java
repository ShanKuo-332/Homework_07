package hw5;

// 請另外建立一個MyRectangleMain類別，此類別只有main方法
// (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
// (2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果


public class Hw5_4_MyRectangleMain {
	public static void main(String[] args) {
		Hw5_4_MyRectangle mr1 = new Hw5_4_MyRectangle();
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println("長方形面積：" + mr1.getArea());
		
		Hw5_4_MyRectangle mr2 = new Hw5_4_MyRectangle(10.0, 20.0);
		System.out.println("長方形面積：" + mr2.getArea());
	}
}
