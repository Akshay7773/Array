package Array;

public class hw30_2 
{
	public static void main(String[] args) 
	{
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		//int newArraysize=0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean isPresentInN=false;
			for(int j=0;j<n.length;j++)
			{
				if(a[i]==n[j])
					isPresentInN=true;
			}
			int rank=0;
			if(isPresentInN==true)
			{
				for(int j=0;j<=i;j++)
				{
					if(a[i]==a[j])
						rank++;
				}
			}
			if(isPresentInN==false ||isPresentInN==true && rank>2)
				System.out.println(a[i]);
		}
	}
}
