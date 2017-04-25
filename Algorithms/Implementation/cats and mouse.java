
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

   


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
       int T = sc.nextInt();
       
       while(T-->0)
       {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           
           int d1 = Math.abs(a-c);
           int d2 = Math.abs(b-c);
           
           if (d1 == d2)  System.out.println("Mouse C");
           else
           
               System.out.println(  d1>d2 ? "Cat B" : "Cat A"  );
           
           
       }
         
    }

}