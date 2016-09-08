public class Matango{
	// フィールド
	int hp = 50;
	private char suffix;
	// コンストラクタ
	public Matango (char suffix){
		this.suffix = suffix;
	}
	// メソッド
	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println(h.getName() + "に，10のダメージ！");
		h.setHp(h.getHp() - 10);
	}
}