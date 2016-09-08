public class Main { 
	public static void main(String[] args){
		Y[] instArr = new Y[2];
		instArr[0] = new A();
		instArr[1] = new B();

		for(Y temp : instArr) {
			temp.b();
		}
	}
}