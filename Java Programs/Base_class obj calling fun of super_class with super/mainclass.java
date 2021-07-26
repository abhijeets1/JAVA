class mainclass {
	public static void main(String[] args) {
		base_class obj = new base_class();
		obj.fun();
	}
}

class super_class {
	void fun() {
		System.out.println("Abhijeet");
	}
}

class intermediate_class extends super_class {

}

class base_class extends intermediate_class {
	void fun() {
		super.fun();
	}
}