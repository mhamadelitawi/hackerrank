import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int q = sc.nextInt();
        int m, n;
        int x, y = x = 1;
        long cost = 0;
        int sizeX, sizeY;
        ArrayList<Long> arrayY, arrayX;
        for (int i = 0; i < q; i++){
            cost = 0;
            x = y = 1;
            m = sc.nextInt();
            n = sc.nextInt();
            arrayY = new ArrayList<>();
            arrayX = new ArrayList<>();
            for (int j = 0; j < m - 1; j++){
                arrayY.add(sc.nextLong());
            }
            for (int j = 0; j < n - 1; j++){
                arrayX.add(sc.nextLong());
            }
            Collections.sort(arrayX);
            Collections.reverse(arrayX);
            Collections.sort(arrayY);
            Collections.reverse(arrayY);
            sizeX = arrayX.size();
            sizeY = arrayY.size();
           while (sizeX>0 || sizeY>0){
               if ((sizeX>0 && sizeY==0) || ((sizeX>0) && (arrayX.get(x - 1)>arrayY.get(y - 1)))){
                   cost += y*arrayX.get(x - 1);
                   x++;
                   sizeX--;
               }
               else if (sizeY>0){
                   cost += x*arrayY.get(y - 1);
                   y++;
                   sizeY--;
               }
               cost = cost%((int)Math.pow(10,9)+7);
           }
           System.out.println(cost%((int)Math.pow(10,9)+7));
        }
    }
}