class mainclass implements I {

	/*static*/ public void fun () {} // Error :- overriding method is static

	public static void main(String[] args) {
		I ref = new mainclass();
	}
}

interface I {

	/*void fun () { // Error :- Interface abstract methods cannot have body
		System.out.println("Function");
	}*/

	void fun ();
}