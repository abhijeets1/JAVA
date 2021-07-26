class mainclass
{
	public static void main(String s[])
	{
		int num = 12321;
		int arr[] = new int[10];

		while(num != 0)
		{
			int ldig = num %10;
			arr[ldig]++;
			num/=10;
		}
		int srtdnum = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i];j>0;j--)
			{
				srtdnum = (srtdnum*10) + i;
			}
		}
		System.out.println(srtdnum);
	}
}