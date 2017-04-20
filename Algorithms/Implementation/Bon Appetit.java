
import java.util.Scanner;


public class Solution {

   


    public static void main(String[] args) {
    
  

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int in = sc.nextInt();
       long s = 0 ;
       
       for (int i = 0 ; i < n ; i++)
       {
          int x = sc.nextInt();
           if (in != i) s += x;
       }
  
       s = s/2;
      
       
       long f = sc.nextLong();
       
      // f = f-s;
       
       // System.out.println("--"+f);
       if ( f > s) System.out.println(f-s);
       else
           System.out.println("Bon Appetit");
      
   
    }


}