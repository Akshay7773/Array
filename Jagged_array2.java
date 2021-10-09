//jagged array example
public class Jagged_array2
{
	public static void main(String args[])
	{
		int num[][]=new int[3][];
		num[0]=new int[3];
		num[1]=new int[2];
		num[2]=new int[1];
		num[0][0]=10;
		num[0][1]=11;
		num[0][2]=12;
		num[1][0]=13;
		num[1][1]=14;
		num[2][0]=15;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
