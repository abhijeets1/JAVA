class mainclass {
	public static void main(String[] args) {
		A ref = new B();
		ref.fun();
	}
}

interface A {
	void fun(); // static abstract public
}

class B implements A {
	public void fun() {
		System.out.println("Abhijeet");
	}
}