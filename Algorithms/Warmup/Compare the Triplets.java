import java.util.Scanner;





public class Solution {

    
       static int score1 = 0 ;
       static int score2 = 0 ;
    
       
       static void rate(int a , int b)
       {
           if (a == b) return ;
           if (a > b) score1 ++;
           else  score2 ++;
       }
       
       
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
  
        rate(a0 , b0);
        rate(a1 , b1);
        rate(a2 , b2);
        
        System.out.println(score1+  " "  + score2);
        
        
    }
}
