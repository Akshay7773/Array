package Array;

import java.util.Arrays;

public class hw3 
{
	public static void main(String[] args) 
	{
		int[] a= {1,1,1,1,2,2,3,4,5,5,5,6,7,8,8,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		int[] b=new int[a.length-count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int rank=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					rank++;
			}
			if(rank==0)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
