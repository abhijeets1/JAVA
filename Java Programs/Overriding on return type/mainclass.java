class mainclass extends A {

	float fun() {
		System.out.println("M");
		return 0.0f;
	}

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.fun();

		mainclass obj2 = new mainclass();
		obj2.fun();
	}

}

class A {

	int fun() { // return type mainclass gives error
		System.out.println("A");
		return 0;
	}
	
}