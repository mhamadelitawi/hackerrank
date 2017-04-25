
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

   


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String s = sc.next();
       
       int loc = 0;
       int old;
       int turn = 0;
       for (int i = 0 ; i < n ; i++)
       {
           old = loc;
           if (s.charAt(i) == 'U') loc++;
           else loc--;
          
           if ( loc ==0 && old < 0)
           turn ++;
           
           
       }
        System.out.println(turn);
        
        
      
   
    }


}