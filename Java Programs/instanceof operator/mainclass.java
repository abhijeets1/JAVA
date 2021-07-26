class mainclass {
	public static void main(String[] args) {

		A obj = new B();
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println();

		/*B or A*/ A obj2 = null; // If null is not assigned then it shows error that says we need to initialized it.
		System.out.println(obj2 instanceof B);
		System.out.println(obj2 instanceof A);
		System.out.println();

		A obj3 = new A();
		System.out.println(obj3 instanceof B);
		System.out.println(obj3 instanceof A);
		System.out.println();

		B obj4 = new B();
		System.out.println(obj4 instanceof B);
		System.out.println(obj4 instanceof A);
		System.out.println();

		I1 ref = new A();
		System.out.println(ref instanceof I1);
		System.out.println(ref instanceof I2);
		System.out.println(ref instanceof I3);
		System.out.println(ref instanceof A);
		System.out.println(ref instanceof B);
	}
}

class A implements I3 /*I1,I2,I3*/{
	void print_B() {}
}

class B extends A {
	@Override
	void print_B() {}
}

interface I1 {}
interface I2 extends I1 {}
interface I3 extends I2 {}