import java.util.*;
class ArrayTrial
{
	public static void main(String args[])
	{
		//int arr[];								//Not Allowed, Error.
		//arr[]={1,2,3,4,5,6,7,8,9,10};

		int arr1[]={1,2,3,4,5,6};					//Alowed.
		int arr2d[][]={{1,2,3},{4,5,6},{7,8,9}};

		//int arr2[]=new int[5];					//Not Allowed, Error.
		//arr2={1,2,3,4,5};

		int arr3[]=new int[]{1,2,3,4};				//Allowed.

		//int arr4[]=new int[4]{1,2,3,4};			//Not Allowed, Error.

		int[][] arr5=new int[3][2];					//Allowed.
		int[] arr6=new int[3];

		//int[] arr7=new int[3][];					//Not Allowed, Error.

		//int[][] arr8 = new int[][] ; 				//Not Allowed, Error.

		int[][] arr10 = new int[10][]; 				//Allowed.
													
		int[] arr11[] = new int[2][2];				//Allowed.

		int[] arr12[], arr13;						//Allowed.
		int arr14, arr15[], arr16[][];

		int[][] arr17 = new int[3][];				//Allowed.
		arr17[0] = new int[10];
		arr17[1] = new int[20];
		arr17[2] = new int[30];

		//int[][] arr18 = new int[1][];				//Not Allowed, Error.
		//arr18[0] = {1,2,3,4};

		//int[][] arr19 = new int[][];			//Not Allowed

		//int[][] arr20 = new int[3][];				//Not, Allowed.
		//arr20[0] = new int[10]{1,2,3};
		//arr20[1] = new int[20]{12,13,14,15};
		//arr20[2] = new int[30]{20,30,40,50};
	}
}