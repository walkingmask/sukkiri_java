public class Main { 
	public static void main(String[] args){
		// 練習4-1
		System.out.println("- 4-1");
		{
			int[] points = new int[4];
			double[] weights = new double[5];
			boolean[] answers = new boolean[3];
			String[] names = new String[3];
		}
		// 練習4-2
		System.out.println("- 4-2");
		{
			int[] moneyList = {121902, 8302, 55100};
			for(int i=0; i<moneyList.length; i++)
				System.out.println(moneyList[i]);
			for(int i:moneyList)
				System.out.println(i);
		}
		// 練習4-4
		System.out.println("- 4-4");
		{
			int[] numbers = new int[3];
			for(int i=0; i<numbers.length; i++)
				numbers[i] = new java.util.Random().nextInt(10);

			System.out.print("１桁の数字を入力してください -> ");
			int input = new java.util.Scanner(System.in).nextInt();

			for(int i=0; i<numbers.length; i++){
				System.out.print(numbers[i] + " " + input);
				if(input == numbers[i])
					System.out.println("アタリ！");
				else
					System.out.println("ハズレー");
			}
		}
	}
}
