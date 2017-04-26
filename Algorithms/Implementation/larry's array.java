import java.util.Arrays;
import java.util.Scanner;



public class Solution {
    
    
    
     
   
     
     
     //we can easily solve it if we calculate the number of swaps in bubble sort. 
    //If no of swaps is even then print "YES" else print "NO".
     
   static  int getInvCount(int arr[], int n)
{
  int inv_count = 0;
  for (int i = 0; i < n ; i++)
    for (int j = i+1; j < n; j++)
      if (arr[i] > arr[j])
        inv_count++;
 
  return inv_count;
}
     
     
 
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int T = sc.nextInt();
      
      while( T-->0){
      
       int n =  sc.nextInt();

       int t[]= new int[n];
         for (int i = 0 ; i < n ; i++)
       {
           t[i]= sc.nextInt();
       }
       
       
       int nbswaps = getInvCount(t, n);
       if (nbswaps%2 ==0)
       System.out.println("YES");
       else
        System.out.println("NO");   
      }
        
      
      
       }     
    }

