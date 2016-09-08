
public class Cleric { 
	String name;
	static int MAX_HP = 50;
	int hp            = 50;
	static int MAX_MP = 10;
	int mp            = 10;

	//void attack(){}
	void selfAid(){
		System.out.println(this.name + "は，セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println(this.name + "は，HPが最大まで回復した！");
	}

	int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int recover = sec + new java.util.Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println(this.name + "は，MPが" + recoverActual + "回復した");
		return(recoverActual);
	}

	void sit(int sec){
		System.out.println(this.name + "は，" + sec + "秒座った！");
		this.hp += sec;
		System.out.println("HPが" + sec + "ポイント回復した！");
	}

	void slip(){
		System.out.println(this.name + "は，転んだ！");
		this.hp -= 5;
		System.out.println("5のダメージ！");
	}

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は，眠って回復した！");
	}
}
