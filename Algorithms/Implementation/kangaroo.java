
import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeMap;




public class Solution {

    
 
    
    
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double v1 = sc.nextInt();
        double x2 = sc.nextInt();
        double v2 = sc.nextInt();
        
      
        
     System.out.println (( (x2-x1)*(v2-v1)<0) &&   ((x2-x1)/(v1-v2)%1==0 ) ? "YES" : "NO" ); 
       
        
    }

}