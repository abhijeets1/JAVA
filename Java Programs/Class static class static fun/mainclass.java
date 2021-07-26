class mainclass {
	public static void main(String[] args) {
		Outer_class.Inner_class.fun();
	}
}

/*Error static*/ class Outer_class {
	static class Inner_class {
		static void fun() {
			System.out.println("Abhijeet Shahakar !");
		}
	}
}