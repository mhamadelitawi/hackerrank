
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
         int p = 0 , n=0 , z=0 , f , c = in.nextInt();
         in.nextLine();
         for (int i = 0 ; i < c ; i++)
         {
             f = in.nextInt();
             if (f == 0) z++;
             else
             {
                 if (f>0) p++;
                 else
                     n++;
             }    
         }
         double g =(double)p/c;
         System.out.printf("%.5f",(double)p/c);
         System.out.println("");
      System.out.printf("%.5f",(double)n/c);
       System.out.println("");
      System.out.printf("%.5f",(double)z/c);
         
         
         
    }
    
}
