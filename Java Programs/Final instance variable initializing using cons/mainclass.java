/*

It is necessary to initialize final variable directly or by constructor.

*/
class mainclass {

	final int var = 10;
	final int var2;

	mainclass() {
		var2 = 20;
	}

	mainclass(int n) {
		var2 = n;
	}

	void printfun() {
		System.out.println(var + " " + var2);
	}

	public static void main(String[] args) {
		mainclass obj = new mainclass();
		obj.printfun();

		mainclass obj2 = new mainclass(22);
		obj2.printfun();

		obj2 = new mainclass(23);
		obj2.printfun();
	}
}