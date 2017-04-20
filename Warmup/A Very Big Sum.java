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
         long su = 0;
      
       
         for (int i = 0 ; i < n ; i++)
            su += in.nextLong();
          
        System.out.println(su);
    }
    
}
