class mainclass {
	public static void main(String[] args) {
		// B obj = (B)new A();
		/* 
		
		java.lang.ClassCastException: 
		A cannot be cast to B at mainclass.main(mainclass.java:3)

		*/

		A obj = (A)new B(); // Upcasting is inbuilt.
							// No need of explicite upcast.
		B obj2 = (B)obj;
	}
}

class A {}
class B extends A {}

/*
	Conclusion:-
	1] Downcast is not possible .
	2] Upcast is possible.
	3] But upcasted obj can be downcasted.
*/