package Array;

public class hw27 
{
	public static void main(String[] args) 
	{
		char[] s1= {'a','b','c','d'};
		char[] s2= {'p','o','i','u','v','w'};
		char[] s3=new char[s1.length+s2.length];
		int index=0;
		for(int i=0;i<s1.length || i<s2.length;i++)
		{
			if(i<s1.length)
				s3[index++]=s1[i];
			if(i<s2.length)
				s3[index++]=s2[i];
		}
		for(int i=0;i<s3.length;i++)
		{
			System.out.println(s3[i]);
		}
	}
}
