public class PoisonMatango extends Matango{
	// フィールド
	private int poisonCount = 5;
	// コンストラクタ
	public PoisonMatango (char suffix){
		super(suffix);
	}
	// メソッド
	public void attack(Hero h){
		super.attack(h);
		if(poisonCount != 0){
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.getHp()/5;
			h.setHp(h.getHp() - dmg);
			System.out.println(h.getName() + "に" + dmg + "ポイントのダメージ！");
			poisonCount--;
		}
	}
}