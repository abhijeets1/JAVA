import java.lang.reflect.*;

class mainclass {

	mainclass(A obj) { // 1
		System.out.println(obj.getClass().getName());
	}
	mainclass(B obj) { // 2
		
	}
	mainclass(C obj) { // 3
		System.out.println(obj.getClass().getName());	
	}
	mainclass(D obj) { // 4
		
	}

	/*public static void main(String[] args) {
		A obj = new B();
		new mainclass(obj); // calls 1st cons but prints B
	}*/

	public static void main(String[] args) {

		A ao = new A();
		new mainclass(ao);

		B bo = new B(); // cons 2 worked
		new mainclass(bo);

		A po = new B();
		new mainclass(po);

		C co = new C();
		new mainclass(co);

		D dob = new D(); // cons 4 worked
		new mainclass(dob);

		C npo = new D();
		new mainclass(npo);

	}
}

class A { // Polymorphism...
	static A method(){return new A();};
}

class B extends A {
	// @Override // error because of java rules but jvm accepts it.
	static B method(){return new B();};
}

class C { // No - Polymorphism...
	
}

class D extends C {
	
}