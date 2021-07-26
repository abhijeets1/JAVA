import java.util.Scanner;
class MidPyramid
{
	public static int x=40;
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the heignt of kite: ");
		int n=input.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int k=0;k<x;k++)
			System.out.print(" ");				
				for(int j=0;j<=i;j++)
				{
					System.out.print("  "+"*"+" ");	
				}
			System.out.println();
			x-=2;
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int k=0;k<x+4;k++)
			System.out.print(" ");
				for(int j=0;j<=i;j++)
				{	
					System.out.print("  "+"*"+" ");	
				}
			System.out.println();
			x+=2;
		}
	}
}