class mainClass
{
	class inner
	{
		int n;
		void prin()
		{
			System.out.println(n);
		}
	}

	static class inner2
	{
		int n;
		void prin()
		{
			System.out.println(n);
		}
	}

	public static void main(String args[])
	{
		mainClass obj = new mainClass(); // we can make more than one obj of non-static class
		mainClass.inner obj2 = obj.new inner();
		obj2.n = 22;
		obj2.prin();

		mainClass.inner2 obj3 = new mainClass.inner2(); // we can make more than one obj of static class
		obj3.n = 23;
		obj3.prin();

		// mainClass.inner2 obj4 = obj.new inner2(); // Error
	}
}