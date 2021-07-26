/*

Conclusion:-

Static cannot access non-static
Non-static can access static

static function can access non-static data
by using reference of that object in the form of parameter.

*/

class mainclass {

	int n = 1;
	static int m = 2;

	void non_static() {
		System.out.println(n+" "+m);
		staticfun();
	}

	static void staticfun() {
		//System.out.println(n+" "); Error
		System.out.println(m);
		//non_static(); Error
	}

	static void Func(mainclass obj) {
		obj.non_static();
		obj.staticfun();
	}
	public static void main(String s[]) {

		mainclass obj = new mainclass();
		obj.non_static();

		System.out.println();
		
		mainclass.Func(obj);
	}
}