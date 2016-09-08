import java.io.IOException;


public class Main { 
	public static void main(String[] args) throws IOException{
		// 練習15-1，15-2
		/*try{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException 例外を catch しました");
			System.out.println("ーースタックトレース(ここから)ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース(ここまで)ーー");
		}*/
		// 練習15-3
		/*try{
			int i = Integer.parseInt("三");
		}
		catch(NumberFormatException e){
			System.out.println("error:NumberFormatException 指定された文字列が１０進数ではありません．正しい文字列を指定してください．");
			e.printStackTrace();
		}*/
		// 練習15-4
		throw new IOException();
	}
}
