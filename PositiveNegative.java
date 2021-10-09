package Array;

import java.util.Arrays;

public class PositiveNegative 
{
	public static void main(String[] args) 
	{
		int[] a= {1,-2,2,-6,8,-9,5,5,-3,2,-6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if((a[i]<0 && a[j]>0))
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
