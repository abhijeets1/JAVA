class Matrixrcaddi
{
	public static void main(String args[])
	{
		int[][] mat = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
					   
		int sumr,sumc,utsum,ltsum,dsum,rdsum;
		sumr=sumc=utsum=ltsum=dsum=rdsum=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1) 	sumr+=mat[i][j];
				if(j==1) 	sumc+=mat[i][j];
				if(j>i)  	utsum+=mat[i][j];
				if(j<i)  	ltsum+=mat[i][j];
				if(j==i)  	dsum+=mat[i][j];
				if(j+i==2)  rdsum+=mat[i][j];
			}
		}
		System.out.println(sumr+sumc + "  "+ utsum + "  " + ltsum + "  " + dsum + "  " + rdsum);
	}
}