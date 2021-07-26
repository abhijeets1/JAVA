class main_class_2 {

	main_class_2 create_object() {
		return this;
	}

	public static void main(String[] args) {
		main_class_2 obj = new main_class_2().create_object();
	}
}