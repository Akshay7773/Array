import java.util.Scanner;
public class Practice1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elemenss");
		int n;
		n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter elemtsf");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Entered elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println("num"+"["+i+"]"+"="+num[i]);
		}
	}
}
