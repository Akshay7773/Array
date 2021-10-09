//input from user in two dimensional array
import java.util.Scanner;
public class TwoD_array3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[][]=new int[2][3];
		System.out.println("Enter array elemens");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered array value are");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("num"+"["+i+"]"+"["+j+"]"+"="+num[i][j]);
			}
		}
		
	}
}
