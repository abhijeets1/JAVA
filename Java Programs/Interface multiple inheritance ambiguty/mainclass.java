class mainclass {
	public static void main(String[] args) {
		
	}
}

interface I1 {
	A fun();
}
interface I2 {
	B fun();
}
// interface I3 extends I1,I2 {} // Error 

class A implements I1,I2{
	// public A fun () {} // Error
	// public B fun () {} // Error
}
class B{}
/*
	types I2 and I1 are incompatible; both define fun(), but with unrelated return types
	interface I3 extends I1,I2 {}

*/