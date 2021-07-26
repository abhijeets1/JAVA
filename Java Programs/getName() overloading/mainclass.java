class mainclass {
	String getName() {
		return "mainclass (user defined)";
	}
	public static void main(String[] args) {
		mainclass obj = new mainclass();
		System.out.println(obj.getName());
		System.out.println(obj.getClass().getName());
	}
}