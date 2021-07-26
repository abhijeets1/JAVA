class mainclass {

	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		f.printfun(); // Finals
		s.printfun();
		d.printfun();
		System.out.println();
		f.printfun2(); // Statics
		s.printfun2();
		d.printfun2();
	}

}

class Father {
	public final void printfun() {
		System.out.println("Father");
	}
	public static void printfun2() {
		System.out.println("Father");
	}
}

class Son extends Father{
	/*public final void printfun() {
		System.out.println("Son");
	}*/
	public static void printfun2() {
		System.out.println("Son");
	}
}

class Daughter extends Father{
	/*public final void printfun() {
		System.out.println("Daughter");
	}
*/	public static void printfun2() {
		System.out.println("Daughter");
	}
}

/*

We cannot override final methods

*/