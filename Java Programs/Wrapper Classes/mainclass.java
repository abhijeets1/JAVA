class mainclass {
	public static void main(String[] args) {

		Integer n = Integer.valueOf("12123");
		System.out.println(n);

		Character ch = Character.valueOf('a');
		System.out.println(ch);

		Float f = Float.valueOf("3.14f");
		System.out.println(f);

		Double d = Double.valueOf("3.14");
		System.out.println(d);
		System.out.printf("%.3f%n",d);

		Boolean b = Boolean.valueOf("true");
		System.out.println(b);

		Byte by = Byte.valueOf("12");
		System.out.println(by);


		String s = new String("12123");
		int num = Integer.parseInt(s);
		System.out.println(num);


		int num2 = n.intValue();
	}	
}