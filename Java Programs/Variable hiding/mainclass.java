class mainclass extends superclass {
	int a = 20;
	int get() {
		return super.a;
	}
	public static void main(String[] args) {
		mainclass obj = new mainclass();
		System.out.println(obj.get());
	}
}

class superclass {
	int a = 10;
}