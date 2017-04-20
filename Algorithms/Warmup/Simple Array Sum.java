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
         int s= 0 ; 
         for (int i = 0 ; i < n ; i++)
             s+=in.nextInt();
        System.out.println(s);
    }
    
}