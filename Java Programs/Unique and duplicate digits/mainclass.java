class mainclass
{
	public static void main(String s[])
	{
		int arr[] = new int[10];
		int num = 123129;
		while(num > 0)
		{
			int check = num % 10;
			arr[check]++;
			num/=10;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1) // unique
			{
				System.out.println(i + " " + arr[i]);
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1) // duplicate
			{
				System.out.println(i + " " + arr[i]);
			}
		}
	}
}