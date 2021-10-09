//Enhanced for loop in oneD array using user input
import java.util.Scanner;
public class Enhanced_for2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter values");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Entered values are=");
		for(int i:num)
		{
			System.out.println(i);
		}
	}
}
