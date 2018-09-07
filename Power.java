import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int result=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(n>=0&&k==0)
    {
     result=1;
    }
     else if(n==0&&k>=1)
     { 
     result=0;
     }
     else
     {
     for(int i=1;i<=k;i++)
	   {
     result=result*n;
 	   }	    
     }
    System.out.println(result); 
	}
} 
