class mainclass {
	public static void main(String[] args) {
		A obj = new B();
		obj.fun_print();
	}
}


class A {
	public void fun_print() {
		System.out.println("Super");
	}
}


class B extends A {
	@Override
	public void fun_print() {
		System.out.println("Sub");
	}
}