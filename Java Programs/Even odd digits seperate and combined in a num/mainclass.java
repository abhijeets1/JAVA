class mainclass
{
	public static void main(String s[])
	{
		int num = 12345678;
		int arr[] = new int[10];
		int ev,od,j=1;
		ev=od=0;
		while(num != 0)
		{
			int ldig = num %10;
			if(ldig%2 == 0)
			{
				ev = (ev*10) + ldig;
			}
			else
			{
				od = (od*10) + ldig;
				j*=10;
			}
			num/=10;
		}
		int singlevod = ev*j+od;
		System.out.println(ev+" "+od+" "+singlevod);
	}
}