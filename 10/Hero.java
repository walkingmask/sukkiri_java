public class Hero{
	private int hp;
	private String name;

	public int getHp(){ return this.hp; }
	public void setHp(int hp){ this.hp = hp; }

	public String getName(){ return this.name; }
	public void setName(String name){ this.name = name; }

	public void slip(){
		System.out.println(this.name + "は，滑った！");
		this.hp -= 10;
		System.out.println(this.name + "は，10のダメージを受けた！");
	}

	public Hero(){
		this.hp = 100;
		this.name = "ナルト";
	}
}