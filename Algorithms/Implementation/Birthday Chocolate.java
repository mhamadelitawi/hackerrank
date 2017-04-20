
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        int way = 0 ;
        if (m > squares.length ) return 0;
        
        int s = 0;
        int i  ; 
        for (i = 0 ; i < m ; i++)
        {
  //          System.out.println("i =="+i);
            s += squares[i];
        }
        
          if ( s == d) way++;

        for (; i < squares.length ;i++)
        {
         //  System.out.println("squares[i] =="+squares[i]+"squares[i-m] =="+squares[i-m]);
            s = squares[i] + s -squares[i-m] ;
          
            if ( s == d) way++;
        }
        
        return way;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
