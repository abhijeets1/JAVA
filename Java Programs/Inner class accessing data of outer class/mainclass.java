class mainclass {
	public static void main(String[] args) {

		Outer_class obj = new Outer_class();
		obj.num = 10;

		Outer_class.Inner_class obj2 = obj.new Inner_class();
		obj2.num2 = 20;
		//obj2.num = 20; // Error

		System.out.println(obj2.num2);

	}
}

class Outer_class {

	int num;
	class Inner_class {
		
		int num2;
	}
}