class mainclass1 {
	public static void main(String[] args) {
		A obj = new A();
		A obj2 = new A();

		System.out.println(obj.num + " " + obj2.num);
	}
}

class A implements I {
	int i = 0; // not static 
	public void fun() {

	}
}

interface I {
	int num = 0; // final static
	void fun();
}