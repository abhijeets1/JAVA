class mainclass {
	void fun1() {
		System.out.println("Fun1");
		main(new String[]{"a","b","c"});
	}
	void fun2() {
		System.out.println("Fun2");
		fun1();
	}
	public static void main(String[] args) {
		System.out.println("mainclass");
		mainclass obj = new mainclass();
		obj.fun1();
	}
}