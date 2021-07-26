class mainclass extends B {
	static int n3 = 3;

	A fun() {
		return this; // here this represents the class type
		// mainclass obj can be converted to type A.
	}

	/*B fun() { // Redeclaration Error
		return this;
	}*/

	public static void main(String[] args) {
		mainclass obj1 = new mainclass();
		obj1.n1 = 10;

		A obj2 = obj1.fun();
		System.out.println(obj2.n1);
		obj2.n1 = 20;
		System.out.println(obj1.n1);
		// System.out.println(ob2.o); // error

		mainclass obj1cpy = obj1;
		System.out.println(obj1cpy.n1);
	}
}

class A { 
	int n1 = 1;
}
class B extends A{
	int n2 = 2;
	/*mainclass fun_sam() { // incompatible types: B cannot be converted to mainclass
		return this; // B type can't be converted into mainclass type downcasting.
	}*/
}

/*

	1] If we convert a derivedclass obj to Base class type then 
	derived class data of that obj
	is present but it is unabled to used.

	2] If we copy objs directly by assignment operator
	then only reference is copied and copied obj reflects 
	original obj.

*/