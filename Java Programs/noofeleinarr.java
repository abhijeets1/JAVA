import java.util.Scanner;

class noofeleinarr
{
	public static void main(String args[])
	{
		int n,count=0,maxcount=0,nmaxele=0;
		int[] arr, arr2, arr3;
		Scanner ip = new Scanner(System.in);

		System.out.print("How many elements do you want to enter: ");
		n=ip.nextInt();
		arr = new int[n];
		arr2 = new int[n];
		arr3 = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter Element (" + (i+1) + "): ");
			int num = ip.nextInt();
			arr[i] = num;
		}

		for(int i=0;i<arr.length;i++)
		{
			count=0;
			boolean brk=false;

			for(int k=0;k<arr.length;k++)
					if(arr[i]==arr2[k])
						{
							brk=true;
							break;
						}	

			if(brk==true)		
				continue;

			arr2[i]=arr[i];

			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}

			if(count>maxcount)
			{
				nmaxele = 0;
				maxcount = count;
				arr3[nmaxele] = arr[i];
			}
			else if(count==maxcount)
			{
				nmaxele++;
				maxcount=count;
				arr3[nmaxele]=arr[i];
			}
		    System.out.println("Element " + arr[i] + " is " + count + " times in array.");
		}

		for(int i=0;i<=nmaxele;i++)
		System.out.println("Element " + arr3[i] + " is maxtimes i.e " + maxcount + " times in array.");
	}
}