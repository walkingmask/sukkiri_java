public class Wand{
	private String name;
	private double power;

	public String getName(){ return this.name; }
	public void setName(String name){
		if(name == null || name.length() < 3)
			throw new IllegalArgumentException("正しい名前を入力してください");
		this.name = name;
	}

	public double getPower(){ return this.power; }
	public void setPower(double power){
		if(power < 0.5 || 100.0 < power)
			throw new IllegalArgumentException("正しい値を入力してください");
		this.power = power;
	}

	public Wand(){
		this.name = "ふつうの杖";
		this.power = 10;
	}
}