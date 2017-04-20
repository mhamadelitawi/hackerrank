
import java.util.Scanner;


public class Solution { 
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int score = in.nextInt();
        int max = score;
        int min = score;
        int maxB = 0 ;
        int minB = 0;
        
        for (int i = 1  ; i < n ; i++)
        {
             score = in.nextInt();
             if (score >  max)
             {
                 maxB++;
                 max = score;
             }
             
             if(score < min)
             {
                 minB++;
                 min = score;
             }  
        }
        
        System.out.println(maxB +" "+minB);
        
        
        
    }
       
}
