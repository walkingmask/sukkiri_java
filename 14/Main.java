/*---
Object class上で宣言されていないフィールドは使うことが出来ない => 多態性

public class Main { 
	public static void main(String[] args){
		Object[] objs = new Object[2];
		objs[0] = new Hero("ナルト");
		objs[1] = new Magician("サスケ");

		for(Object obj : objs){
			System.out.println(obj.name);
		}
	}
}
---*/

public class Main { 
	public static void main(String[] args){
		Hero h = new Hero("ナルト");
		Magician m = new Magician("サスケ");

		System.out.println(h.toString());
		System.out.println(m.toString());

		if(h.equals(m) == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}