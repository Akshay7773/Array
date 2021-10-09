//Dynamic memory allocation in Jagged array
import java.util.Scanner;
public class Jagged_array4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m;
		System.out.println("Enter value for n i.e. row");
		m=sc.nextInt();
		int num[][]=new int[m][];
		System.out.println("Enter values for columns");
		for(int i=0;i<m;i++)
		{
			System.out.print("No. of elements in row "+(i+1)+": ");
			int n=sc.nextInt();
			num[i]=new int[n];
		}
		System.out.println("Enter values:");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
}
