
import java.util.Scanner;

/**
 *
 * @author Mhamad
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
        String[] t = in.nextLine().split(":");
        int f= Integer.parseInt(t[0]);
        if ((t[2].charAt(2) == 'P' || t[2].charAt(2) == 'p' )  )
            if (t[0].equals("12")) f=12;
                    else
            f+=12;
        else{
        if (f == 12 )  f=0;
    }
        t[0] = f+"";
        if (f < 10) t[0]="0"+t[0];
        
        System.out.println(t[0]+":"+t[1]+":"+t[2].charAt(0)+t[2].charAt(1));
      
    }
    
}