class mainclass
{
	public static void main(String s[])
	{
		int array[]={43,20,22,34,1,30,4};
		int max=Integer.MIN_VALUE, max2nd=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE, min2nd=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=max)
			{
				max2nd = max;
				max = array[i];
			}
			else if(array[i]>=max2nd)
			{
				max2nd = array[i];
			}

			if(array[i]<=min)
			{
				min2nd = min;
				min = array[i];
			}
			else if(array[i]<=min2nd)
			{
				min2nd = array[i];
			}
		}
		System.out.println(max + "  " + max2nd);
		System.out.println(min + "  " + min2nd);
	}
}