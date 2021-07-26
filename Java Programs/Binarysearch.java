import java.util.Scanner;
class Binarysearch {
	static public void main(String args[])
	{
		int a[];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size=input.nextInt();
		
		a=new int[size];

		System.out.println("Enter " + size + " elements: ");
		for(int i=0;i<size;i++)
		{
			int num=input.nextInt();
			a[i]=num;
		}

        System.out.print("Enter Element you want to search: ");
		int search=input.nextInt();

		int first=0, last=a.length;
		int mid=(first + last)/2;

		while(first<last)
		{
			if(a[mid]==search)
			{
				System.out.println("Element Found at location "+mid);
				break;
			}
			else if(a[mid]<search)
			{
				first=mid;
			}
			else if(a[mid]>search)
			{
				last=mid;
			}
			mid=(first + last)/2;
		}
		if(first==last)
		{
			System.out.println("Element Not Found!!");
		}
		input.close();
	}
}