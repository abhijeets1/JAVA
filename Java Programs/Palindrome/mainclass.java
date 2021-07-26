class mainclass
{
	public static void main(String s[])
	{
		int num = 12321;
		int copy = num;
		int check = 0;
		while(copy != 0)
		{
			check *= 10;
			check = check + copy%10;
			copy /= 10;
		}
		if(check == num)
		{
			System.out.println(check);
		}
	}
}