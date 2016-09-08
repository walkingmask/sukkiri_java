public class Magician {
	String name;
	int hp;
	int mp;

	public Magician(String name){
		this.hp = 70;
		this.mp = 20;
		this.name = name;
	}

	public String toString(){
		return "名前:"+this.name+"/HP:"+this.hp+"/MP:"+this.mp;
	}
}