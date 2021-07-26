class main_class {

	main_class fun_1() {
		System.out.println("C");
		return this;
	}

	main_class fun_2() {
		System.out.println("C++");
		return this;
	}

	main_class fun_3() {
		System.out.println("Java");
		return this;
	}

	public static void main(String[] args) {
		main_class obj = new main_class().fun_1().fun_2().fun_3();
		System.out.println();
		new main_class().fun_1().fun_2().fun_3();
	}
}