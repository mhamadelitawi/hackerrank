import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int t1 [] = new int[n];
			int t2 [] = new int[n];
		
			int z ;
			
			for (int i = 0 ; i < n ; i++)
			{
				
				t1[i] = sc.nextInt();
				
			}
			
			for (int i = 0 ; i < n ; i++)
			{
				t2[i] = sc.nextInt();
				
			}
			Arrays.sort(t1);
			Arrays.sort(t2);
			boolean dij=true;
			
			for (int i = 0 ; i <  n  ; i++)
			{
				if (t1[i] + t2[n - i - 1] < k   ) dij = false;
			}
			System.out.println( dij ? "YES" : "NO"  );
			
		}
		
		
	
	}

}
