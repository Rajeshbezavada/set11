import java.util.*;
import java.lang.*;
import java.io.*;
class Arithematic{
     static int sumOfAP(int a, int d,int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
    public static void main(String args[])throws ioExceptions
    {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(sumOfAP(a, d, n));
    }
}
 
