import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int t[] = new int[100];
        for(int a_i=0; a_i < n; a_i++)
                    t[ in.nextInt() ]++;
  
        
        int max = 0 ;
        
        for (int i=1 ; i < 100 ; i++)  {
            
            int z = t[i] + t[i-1];
            max = (z > max) ? z : max;
        }
        System.out.println(max);
    }
}
