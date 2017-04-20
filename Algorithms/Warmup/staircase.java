
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
         int x = in.nextInt() , w = x-1;
         for (int i = 0 ; i < x ; i++)
         {
              for (int j = 0 ; j < w ; j++)
                 System.out.print(" "); 
             for (int j = 0 ; j <= i ; j++)
                 System.out.print("#"); 
             System.out.println("");
             w--;
         }
    }
    
}
