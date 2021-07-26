class mainclass {
	public static void main(String[] args) {
		System.out.println(A.a);
	}
}

class A {
	@Deprecated
	public static int a = 1212;
}