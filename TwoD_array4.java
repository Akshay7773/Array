//array length in two dimensional array
public class TwoD_array4 
{
	public static void main(String args[])
	{
		int num[][]=new int[2][4];
		num[0][0]=11;
		num[0][1]=12;
		num[0][2]=13;
		num[0][3]=14;
		num[1][0]=15;
		num[1][1]=16;
		num[1][2]=17;
		num[1][3]=18;
		System.out.println(num[0][2]);
		System.out.println("Array row length="+num.length);
		System.out.println("Array column length="+num[0].length);

	}
}
