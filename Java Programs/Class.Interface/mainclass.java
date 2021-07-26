class mainclass implements A.I {

	public void fun () {}

	public static void main(String[] args) {
		A.I ref = new mainclass();
	}
}

class A {
	interface I {
		void fun ();
	}
}