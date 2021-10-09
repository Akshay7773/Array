//user input in jagged array
import java.util.Scanner;
public class Jagged_array3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[][]=new int[3][];
		num[0]=new int[3];
		num[1]=new int[4];
		num[2]=new int[5];
		System.out.println("Enter values in arrays");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your entered values are");
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
