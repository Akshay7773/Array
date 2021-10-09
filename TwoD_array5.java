//dynamic memory allocation in two dimensional array
import java.util.Scanner;
public class TwoD_array5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=sc.nextInt();
		System.out.println("Enter columns");
		int m=sc.nextInt();
		int num[][]=new int[n][m];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered elements are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("num"+"["+i+"]"+"["+j+"]"+"="+num[i][j]);
			}
			System.out.println(" ");
		}
	}
}
