class mainclass {
  	public static void main(String []args){

  		// way1

   		String astring1 = "Abhijeet Shahakar Amravati";
    	String[] strSplited = astring1.split("\\s"); /*\\.*/ // Spliting
    	String strJoined = String.join(" ", strSplited); // Joining
    	System.out.println(strJoined + '\n');

    	// way2

    	String astring2 = "Abhijeet. Shahakar. Amravati";
    	StringBuilder astring2New = new StringBuilder();
    	for(char s: astring2.toCharArray()) {
    		astring2New.append(s=='.' ? "" : s);
    	}
    	System.out.println(astring2New);
  	}
}