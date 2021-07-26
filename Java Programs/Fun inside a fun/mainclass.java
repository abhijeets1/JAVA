class mainclass {
	static void fun_outer() {
		void fun_inner() {
			System.out.prinln("Abhijeet");
		}
	}

	public static void main(String s[]) {
		fun_outer().fun_inner();
	}
}