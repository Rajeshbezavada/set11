/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int result,s=1;
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(s<=1000)
		{
			result=(A*B)/C;
			System.out.println(result);
		}
	}
}
