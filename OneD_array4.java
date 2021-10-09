//user input in one dimensional array
import java.util.Scanner;
public class OneD_array4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter 5 integer values");
		for(int i=0;i<=4;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Your entered value is=");
		for(int i=0;i<=4;i++)
		{
			System.out.println(num[i]);
		}
	}
}
