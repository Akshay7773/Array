//Jagged array length
public class Jagged_array1
{
	public static void main(String args[])
	{
		int num[][]=new int[3][];
		num[0]=new int[3];
		num[1]=new int[4];
		num[2]=new int[2];
		System.out.println("Array size 1st="+num.length);
		System.out.println("Array size 2nd="+num[0].length);
		System.out.println("Array size 3rd="+num[1].length);
		System.out.println("Array size 4th="+num[2].length);

	}
}
