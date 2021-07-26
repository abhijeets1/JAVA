class mainclass {

	// static public void sum(String... str, int... numbers) {} // Error
    // static public void sum(int... numbers) {} // Allowed
    // static public void sum(int... numbers, int a) {} // Error

    static public void sum(int a, int... numbers) {
        System.out.println(numbers.length);
    }
    
    static public void sum(int a,String s ,int... numbers) {}

	public static void main(String[] args) {
        sum(1,2,3,4,5,6,7,8,9,10);
    	sum(3,"Abhijeet",1,2,3,4,5,6,7,8,9,10);
	}
}

/*
    Rules of use :-
    1] The Last Argument.
    2] The One and Only Varargs.
    3] Do Not Overload.

*/