class mainclass {
	public static void main(String[] args) {
		String myString = "ABCD";
		char array[] = new char[myString.length()];
		array = myString.toCharArray();
		
		for (char c : array)
		{
	  		System.out.println("Characer is " + c);
		}
	}
}