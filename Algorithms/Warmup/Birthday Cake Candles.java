
import java.util.Scanner;


public class Solution { 
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long max = 0;
        long rep = 0 ;
         long l;
        for(int i = 0 ; i < n ; i++)
        {
             l= in.nextLong();
             if (l > max)
             {
                 rep = 1; 
                 max = l;
             }
             else 
                 if (l == max) rep++;  
        }
        System.out.println(rep);
       
        
        
    }
       
}
