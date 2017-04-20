
import java.util.Scanner;


public class Solution {


 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[101] ; 
        int n = sc.nextInt();
        for (int i = 0 ; i <n ; i++)
        {
            t[sc.nextInt()] ++;
        }
        
        int res = 0 ;
        
        for (int i = 0 ; i < 101 ; i++)
        {
            res += t[i]/2;
            //System.out.println(i + "--" + t[i] );
        }
        
        System.out.println(res);
      
    }
}
