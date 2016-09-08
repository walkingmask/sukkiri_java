public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp(){ return this.hp; }
	public void setHp(int hp){ this.hp = (hp < 0)? 0 : hp; }

	public int getMp(){ return this.mp; }
	public void setpM(int mp){
		if(mp < 0)
			throw new IllegalArgumentException("正しい値を入力してください");
		this.mp = mp;
	}

	public String getName(){ return this.name; }
	public void setName(String name){
		if(name == null || name.length() < 3)
			throw new IllegalArgumentException("正しい名前を入力してください");
		this.name = name;
	}

	public Wand getWand(){ return this.wand; }
	public void setWand(Wand wand){
		if(wand == null)
			throw new IllegalArgumentException("正しい杖を入力してください");
		this.wand = wand;
	}

	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int)(basePoint + this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(this.name + "は，" + h.getName() + "のHPを" +recovPoint + "回復した！");
	}

	public Wizard(){
		this.hp = 70;
		this.mp = 20;
		this.name = "サスケ";
		wand = new Wand();
	}
}