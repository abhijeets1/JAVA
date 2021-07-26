class StringBuilderCapacity {
	public static void main(String[] args) {
		
		StringBuilder str2 = new StringBuilder(10); 
        System.out.println(str2.capacity() + " " + str2.toString());
        str2.append("Abhijeet - 1");
        System.out.println(str2.capacity() + " " + str2.toString()); 
	}
}