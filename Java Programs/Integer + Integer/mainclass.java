class mainclass {
	public static void main(String[] args) {
		Integer n1 = new Integer("12");
		Integer n2 = new Integer("21");

		int n3 = 30;
		Integer result1 = Integer.valueOf(n3) + n2;
		Integer result2 = new Integer(n3) + n2;
		
		System.out.println(result1 +" "+result2);
	}
}