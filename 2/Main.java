public class Main { 
	public static void main(String[] args){
		// 練習2-1
		{
			int x = 5;
			int y = 10;
			String ans = "x + y は " + (x + y);
			System.out.println(ans);
		}
		// 練習2-3
		{
			System.out.println("--------------------------------------------------------");
			System.out.println("ようこそ占いの館へ");
			System.out.println("ここではあなたの今日の運勢を占います");
			System.out.println("あなたの名前を入力してください");
			System.out.print("-> ");
			String name = new java.util.Scanner(System.in).nextLine(); // 文字列の入力

			System.out.println("あなたの年齢を入力してください");
			System.out.print("-> ");
			String ageString = new java.util.Scanner(System.in).nextLine();

			int age = Integer.parseInt(ageString); // 文字列で表現された整数を整数型のデータに変換する

			int fortune = new java.util.Random().nextInt(4); // 乱数生成・引数は範囲
			fortune++;

			System.out.println("占いの結果が出ました");
			System.out.print(age + " 歳の " + name + " さんの運勢は...");

			if     (fortune == 5)
				System.out.print(" 大凶 ");
			else if(fortune == 4)
				System.out.print(" 凶 ");
			else if(fortune == 3)
				System.out.print(" 吉 ");
			else if(fortune == 2)
				System.out.print(" 中吉 ");
			else
				System.out.print(" 大吉 ");

			System.out.println("です");

		}
	}
}
