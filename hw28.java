package Array;

public class hw28 
{
	public static void main(String[] args) 
	{
		int [][] a= {{6,3,1},{9,7,8},{2,4,5}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int minrow=a[i][j];
				boolean b=true;
				for (int k = 0; k < a[i].length; k++)
				{
					if(a[i][k]<minrow)
						b=false;
				}
				int maxcolumn=a[i][j];
				boolean c=true;
				for(int k=0;k<a.length;k++)
				{
					if(a[k][j]>maxcolumn)
						c=false;
				}
				if(b==true && c==true)
				{
					System.out.println(a[i][j]);
				}
			}
		}
	}
}
