public abstract class Asset{
	// フィールド
	private String name;
	private int    price;
	// コンストラクタ
	public Asset(String name, int price){
		this.name  = name;
		this.price = price;
	}
	// メソッド
	public String getName() { return this.name; }
	public int    getPrice(){ return this.price; }
}