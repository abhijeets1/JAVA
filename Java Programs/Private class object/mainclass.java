/*private */class mainclass // error: modifier private not allowed here
{ 
	public static void main(String args[])
	{
		private_class obj = new private_class();
	}
}

class private_class {
	public int n;
}