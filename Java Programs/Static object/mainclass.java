class mainclass {

	int i = 10;

	static mainclass obj = new mainclass();

	public void printfun() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		obj.printfun();
	}
}

/*

We cannot use this reference in static function.

*/