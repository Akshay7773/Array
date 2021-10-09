//selection sort

package Array;

import java.util.Arrays;

public class Array1 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,43,1,3,5,63,9};
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[index]<a[j])
					index=j;
			}
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
