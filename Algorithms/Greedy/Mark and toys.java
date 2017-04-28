import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextLong();
		long s = 0 ;
		long t[] = new long[n];
		int count = 0 ;
		for (int i = 0 ; i < n ; i++)
		{
			t[i] = sc.nextLong();
		}
		Arrays.sort(t);
		
		boolean bo = true;
		for (int i = 0 ; i < n  && bo; i++)
		{
			s += t[i];
			if (s <= p) 
				count++;
			else
				bo = false;
		}
		System.out.println( count );
	
	}

}
