package Array;

public class hw26 
{
	public static void main(String[] args) 
	{
		int minavg=Integer.MAX_VALUE;
		int[] a= {3,7,90,20,5,50,40};
		int k=3;
		
		for(int i=0;i<=a.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)   
			{
				System.out.print(a[j]+" ");
				sum=sum+a[j];
			}
			System.out.println(sum);
		
			int av=sum/k;
			System.out.println(av);
			if(av<minavg)
				minavg=av;
		}
		
		System.out.println(minavg);
	}
}
