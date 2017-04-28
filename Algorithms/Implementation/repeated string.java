import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        char ch[] = s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'){
                count++;
            }
        }
        int cnt=0;
        for(int i=0;i<n%s.length();i++){
            if(ch[i]=='a'){
                cnt++;
            }
        }
        System.out.println(n/s.length()*count+cnt);
    }

}
