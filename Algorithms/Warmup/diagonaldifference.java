
import java.util.Scanner;

/**
 *
 * @author Mhamad
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         long d1 =0 , d2 = 0;
         for (int i = 0 ; i < n ; i++)
         {
             in.nextLine();
             for (int j = 0 ; j < n ; j++)
             { 
                 long x = in.nextLong();
                 if (i == j) 
                     d1+= x;
                 if (j == n - i -1)
                     d2+= x;
             }
             
         }
         System.out.println(Math.abs(d2-d1));
    }
    
}
