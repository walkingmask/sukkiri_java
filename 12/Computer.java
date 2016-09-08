public class Computer extends TangibleAsset{
	// フィールド
	private String makerName;
	// コンストラクタ
	public Computer(String name, int price, String color, String makerName, double weight){
		super(name, price, color, weight);
		this.makerName  = makerName;
	}
	//メソッド
	public String getMakerName() { return this.makerName; }
}