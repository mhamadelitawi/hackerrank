
import java.util.Arrays;
import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
    
        
        /*
        x has to be between the range max of set A(factors of x) and min of set B(x -> factor of B item).
so that you can optimize the iteration from (1 - 100) to (min - max).
Sorting is to find min and max.
        */
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        
        Scanner sc = new Scanner(System.in);
         Arrays.sort(a);
    Arrays.sort(b);

    int min = a[n-1];
    int max = b[0];
    int count =0;
    for(int i = min;i<=max;i++){
        boolean flag = true;
        for(int j=0;j<n;j++){
            if(i%a[j]!=0){
                flag = false;
                break;
            }                   
        }
        if(flag)
        for(int k=0;k<m;k++){
            if(b[k]%i!=0){
                flag = false;
                break;
            }
        }
        if(flag)
            count++;
    }

    System.out.println(count);
       }     
    }

