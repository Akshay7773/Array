package Array;

import java.util.Arrays;

public class hw30 
{
	public static void main(String[] args) 
	{
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] b= {1,2,4};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c++;
					break;
				}
			}
			int rank=1;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					rank++;
			}
			if(c==0)
				count++;
			if(rank>2)
				count++;
		}
		System.out.println(count);
		int[] d=new int[count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c++;
					break;
				}
			}
			int rank=1;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					rank++;
			}
			if(c==0)
				d[index++]=a[i];
			if(rank>2)
				d[index++]=a[i];
		}
		System.out.println(Arrays.toString(d));
	}
}
