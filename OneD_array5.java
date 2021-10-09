//Dynamic memory allocation in array i.e. size of array
import java.util.Scanner;
public class OneD_array5 
{
	public static void main(String args[])
	{
		System.out.println("Enter How many size of array u want to store");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Entered elements are=");
		for(int i=0;i<n;i++)
		{
			System.out.println("num"+"["+i+"]"+"="+num[i]);
		}
		System.out.println("Array length="+num.length);
	}
}
