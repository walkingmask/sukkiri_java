public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		Wizard w = new Wizard();

		h.slip();
		w.heal(h);
	}
}