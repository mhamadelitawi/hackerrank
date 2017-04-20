
import java.util.Scanner;


public class Solution { 
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long t[] = new long[6];
        
        for (long i = 0 ; i <  n ; i++)
        {
            t[in.nextInt()]++;
        }
        
        int max = 1;
        
        for (int i = 2 ; i < 6 ;i++)
            if (t[i] > t[max] ) max = i;
       
        System.out.println(max);
    }
       
}
