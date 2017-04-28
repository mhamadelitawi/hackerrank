import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char m = 'm';
        char p = 'p';
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numLines = in.nextInt();
        int mX = -1;
        int mY = -1;
        int pX = -1;
        int pY = -1;
        for (int i=0; i<numLines; i++) {
            String line = in.next();
            if (mY < 0) {
                mY = line.indexOf(m);
                mX = i;
            }
            if (pY < 0) {
                pY = line.indexOf(p);
                pX = i;
            }
        }
        
        if (mY < 0 || pY < 0) {
            return;
        }
        
        // x traversal
        if (mX > pX) {
            for (int i=mX; i>pX; i--) {
                System.out.println("UP");
            }
        } else if (mX < pX) {
            for (int i=mX; i<pX; i++) {
                System.out.println("DOWN");
            }
        }

        // y traversal
        if (mY > pY) {
            for (int i=mY; i>pY; i--) {
                System.out.println("LEFT");
            }
        } else if (mY < pY) {
            for (int i=mY; i<pY; i++) {
                System.out.println("RIGHT");
            }
        }
    }
}