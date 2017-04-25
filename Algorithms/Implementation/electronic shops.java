
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {

   


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int money = sc.nextInt();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t1[] = new int[n];
        int t2[] = new int[m];
        
        int s ; 
        int max = -1;
        for (int i = 0 ; i < n ; i++) t1[i]=sc.nextInt();
        for (int i = 0 ; i < m ; i++) t2[i]=sc.nextInt();
        
         for (int i = 0 ; i < n ; i++)
              for (int j = 0 ; j < m ; j++)
              {
                  s = t1[i] + t2[j];
                  if( s == money) {   max = money;            break; }
                  if( s < money)  max = Integer.max(max, s);
              }
         
         System.out.println( max );
         
         
    }

}