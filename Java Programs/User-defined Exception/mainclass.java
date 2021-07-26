class mainclass {
	public static void main(String[] args) {
		try{
			/*throw new Exception("FOOL");*/
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}