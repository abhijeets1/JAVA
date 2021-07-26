class mainclass { // super class

	void fun() {} // Polymorphism is required.

	public static void main(String[] args) { 

		mainclass obj = new mainclass(){ // child class
			void fun() {
				System.out.println("ANONYMOUS");
			}
		};

		obj.fun();

	}
}

/*

	If poly is not developed then :-

	// obj is of type base mainclass
	// It is instancetiated by derived mainclass

	// Hence obj is of type base mainclass and 
	// there in no fun method it is unable to call it.

*/