public class Main { 
	public static void main(String[] args){
		// 練習3-3
		System.out.println("- 3-3");
		{
			int seibetsu = new java.util.Random().nextInt(2);
			int age      = new java.util.Random().nextInt(80);
			
			System.out.println("こんにちは。");

			if(seibetsu == 0){
				System.out.println("私は男です。");
				System.out.println(age + "歳です。");
			}
			else
				System.out.println("私は女です。");

			System.out.println("よろしくおねがいします。");
		}
		// 練習3-5
		System.out.println("- 3-5");
		{
			System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
			System.out.print("入力 -> ");
			int selected = new java.util.Scanner(System.in).nextInt();

			switch(selected){
				case 1:
					System.out.println("検索します");
					break;
				case 2:
					System.out.println("登録します");
					break;
				case 3:
					System.out.println("削除します");
					break;
				case 4:
					System.out.println("変更します");
					break;
				default:
					System.out.println("Error! 1~4の範囲で値を入力してください");
			}
		}
		// 練習3-6
		System.out.println("- 3-6");
		{
			System.out.println("【数あてゲーム】");
			int ans = new java.util.Random().nextInt(10);

			for(int i=0; i<5; i++){
				System.out.print("0 ~ 9の数字を入力してください -> ");
				int num = new java.util.Scanner(System.in).nextInt();

				if(num == ans){
					System.out.println("アタリ！");
					break;
				}
				else
					System.out.println("違います。");
			}

			System.out.println("ゲームを終了します");
		}
	}
}
