
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Solution { 
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong() , min , max;
        min = max = x;
         BigInteger a = BigInteger.ZERO;
          a = a.add(BigInteger.valueOf(x));
          
          
        for (int i = 1 ; i < 5 ; i++)
        {
            x= in.nextLong();
            a = a.add(BigInteger.valueOf(x));
            if (min > x) min = x;
            if (max < x) max = x;
        }
           
       System.out.println ( a.subtract(BigInteger.valueOf(max))   +" "+a.subtract(BigInteger.valueOf(min)));
        
        
        
        
    }
       
}
