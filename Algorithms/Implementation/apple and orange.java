
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
       
        int z ,l, app = 0 , or  = 0 ;
        
       
        for(int apple_i=0; apple_i < m; apple_i++){
             z = in.nextInt();
             l = a+z; 
             if (l >= s && l <= t) app++;
             
             
        }
    
        for(int orange_i=0; orange_i < n; orange_i++){
             z = in.nextInt();
             l = b+z; 
             if (l >= s && l <= t) or++;
        }
        
        
        System.out.println(app);
         System.out.println(or);
    }
}
