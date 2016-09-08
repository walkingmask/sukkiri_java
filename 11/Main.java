public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		Matango mA = new Matango('A');
		PoisonMatango pmA = new PoisonMatango('A');

		h.slip();
		mA.attack(h);
		pmA.attack(h);
	}
}