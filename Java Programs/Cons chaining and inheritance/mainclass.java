/*
	1] Constructor does not get inherited.
	2] Cons calling in optional in inheritance.
	3] There is no way that create and instantiate an obj w/o calling cons.
*/

class mainclass {
	public static void main(String[] args) {
		new B(); // stateless obj or anonymous obj.
	}
}

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		super(); // Optional
		// super.A(); // Error
	}
}