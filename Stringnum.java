import java.util.*;
import java.lang.*;
class Stringnum
{
      public static void main(String aa[]){
       char d;
       Scanner s=new Scanner(System.in);
       d=s.next().charAt(0);
       if(d>='0'&&d<='9'){
           System.out.println("yes");
       }
      else{
           System.out.println("no");
      }
      }
}
