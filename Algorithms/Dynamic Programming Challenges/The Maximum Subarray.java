
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Mhamad
 */



public class Solution {

    public static void main(String[] args) {
        
       // long long x; 
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     for (int ti = 0 ; ti < T ; ti++)
       {
         sc.nextLine();
         int S = sc.nextInt();
         sc.nextLine();
         int t[] = new int[S];
         int ma = 0 , mnMin  = Integer.MIN_VALUE;
         boolean f= false;
         for (int s = 0 ; s< S ; s++)
         {
             t[s] = sc.nextInt();
            if (t[s] > 0) ma+=t[s];
          
           if (t[s] >= 0) f = true;
           else
                mnMin = Math.max(mnMin, t[s]);
           
            
         }
          int max_End = t[0];
         int max_far = t[0];
        
         for (int i = 1 ; i < S ; i++)
         {
             max_End = Math.max(t[i]   , max_End+t[i]);
             max_far = Math.max(max_far   , max_End);
         }
         if (f)
           System.out.println(max_far +" "+ma);
         else
              System.out.println(max_far +" "+mnMin);
         
       }
     /*
     def max_subarray(A):
    max_ending_here = max_so_far = A[0]
    for x in A[1:]:
        max_ending_here = max(x, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far
     */
    }
}
