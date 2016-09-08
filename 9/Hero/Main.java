
public class Main { 
	public static void main(String[] args){
		Sword s1 = new Sword();
		s1.name = "炎の剣";
		s1.damage = 10;

		Sword s2 = new Sword();
		s2.name = "氷の剣";
		s2.damage = 12;

		Hero h1 = new Hero();
		h1.name = "ナルト";
		h1.sword = s1;
		System.out.println(h1.name + "の現在の武器は" + h1.sword.name);

		Hero h2 = new Hero();
		h2.name = "サスケ";
		h2.sword = s2;
		System.out.println(h2.name + "の現在の武器は" + h2.sword.name);

		Cleric c = new Cleric("サクラ", 50);

		Wizard w = new Wizard();
		w.name   = "サイ";
		w.hp     = 70;

		h1.slip();
		h2.slip();
		c.slip();
		w.heal(h1);
		w.heal(h2);
		c.selfAid();
		c.selfAid();
		c.pray(2);
		h1.run();

		h1.money = 100;
		System.out.println(h2.money);

		System.out.println(c.name + "のHPとMPは" + c.hp + "，" + c.mp);
	}
}
