import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();  
         int x = sc.nextInt();
         file f = new file(null  , 1 , x);
         file cur = f;
         for (int i = 1 ; i < n ; i++)
         {
             x = sc.nextInt();
             if ( x != cur.value) 
             {
                 file ne = new file(null , cur.rank +1 , x);
                 ne.prev = cur;    
                cur = ne;
             }        
         }  
        int T = sc.nextInt();
        while (T-->0)
        {
             x = sc.nextInt();           
             while (cur != null && cur.value < x) cur = cur.prev;
             
             if (cur == null) System.out.println("1");
             else 
             {
                 if (cur.value == x) System.out.println(cur.rank);
                 else System.out.println(cur.rank+1);
             }      
        }       
       }     
    }



class file 
{ 
    file prev ; 
    int rank ; 
    int value;
    
    
    file(){}

    public file( file prev, int rank, int value) {   
        this.prev = prev;
        this.rank = rank;
        this.value = value;
    }  
}

