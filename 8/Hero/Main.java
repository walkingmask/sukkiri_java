
public class Main { 
	public static void main(String[] args){
		// 勇者を生成し初期化
		Hero h = new Hero();
		h.name = "ナルト";
		h.hp   = 100;
		// 聖職者を生成し初期化
		Cleric c = new Cleric();
		c.name   = "サクラ";
		c.hp     = 50;

		// お化けキノコAを生成し初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		// お化けキノコBを生成し初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		// 冒険の始まり
		h.slip();
		c.slip();
		m1.run();
		m2.run();
		c.selfAid();
		c.selfAid();
		c.pray(2);
		h.run();
	}
}
