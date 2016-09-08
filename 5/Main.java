public class Main { 
	public static void main(String[] args){
		System.out.println("- 5-1");
		introduceOneself();
		System.out.println("- 5-2");
		email("Hello", "hello@gmail.com", "World");
		System.out.println("- 5-3");
		email("hello@gmail.com", "Hello World");
		System.out.println("- 5-4");
		System.out.println(clacTriangleArea(10.0, 5.0));
		System.out.println(clacCircleArea(5.0));
	}
	// 練習5-1
	public static void introduceOneself(){
		String name   = "hogeta hogetarou";
		int    age    = 20;
		double height = 170.5;
		char   sex    = 'M';
		
		System.out.println("My name is " + name + ".");

		System.out.println("My old is " + age + ".");

		System.out.println("And my height is " + height);

		System.out.print("I am ");
		if(sex == 'M')
			System.out.println("men.");
		else
			System.out.println("women.");
	}
	// 練習5-2
	public static void email(String title, String address, String text){
		System.out.println("「" + address + "」に，以下のメールを送信しました");
		System.out.println("件名:「" + title + "」");
		System.out.println("本文:「" + text  + "」");
	}
	// 練習5-3
	public static void email(String address, String text){
		System.out.println("「" + address + "」に，以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:「" + text  + "」");
	}
	// 練習5-4
	public static double clacTriangleArea(double bottom, double height){
		return ((bottom*height)/2);
	}
	public static double clacCircleArea(double radius){
		return(Math.PI*radius*radius);
	}
}
