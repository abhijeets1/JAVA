class mainclass {
	public static void main(String[] args) {
		new A().getthis().fun();
		new B().getthis().fun(); // one time access object
	}
}

class A {
	A getthis() {
		return this;
	}
	void fun() {
		System.out.println("A");
	}
}

class B extends A {
	B getthis() {
		return this;
	}
	void fun() {  // int fun() error
		System.out.println("B");	
	}
}