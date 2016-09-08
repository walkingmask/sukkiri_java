public class Hero {
	String name;
	int hp;

	public Hero(String name){
		this.hp = 100;
		this.name = name;
	}

	/*public boolean equals(Object o){
		if(this ==o) { return true; }
		if(o instanceof Hero){
			Hero h = (Hero) o;
			if(this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}*/
}