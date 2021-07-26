class mainclass {

	public static void main(String[] args) {
		Block1: {
			System.out.println("!");
			System.out.println("@");
			System.out.println("#");
			if(true) {
				break Block1;
			}
			System.out.println("$");
			int a = 0;
		}
		// a = 22; // error
	}
	
}