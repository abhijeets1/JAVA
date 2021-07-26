class mainclass {
	public static void main(String[] args) {
		A ref = new B();
		ref.fun();
	}
}

abstract class A {
	abstract void fun();
}

class B extends A {
	void fun() {
		System.out.println("Abhijeet");
	}
}