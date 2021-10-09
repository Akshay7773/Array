package Array;

public class hw37 
{
	public static void main(String[] args) 
	{
		int[] a= {1,5,-4,-2,-1};//1,5,-4,-2,5,-1   [[1,5,-4],[-2,5,-1]]

		int s=2;
		for(int i=0;i<a.length-3;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if((a[i]+a[j]+a[k])==s)
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
	}
}
