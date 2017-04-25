
import java.util.Scanner;





public class Solution { 
    
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
       int max = Integer.MIN_VALUE;
        
        for (int i = 0 ; i <  n ; i++)    
           max =  Integer.max(max, in.nextInt() );
        
        int z = (max > k) ?  max - k : 0; 
        System.out.println(z);
    }
}
