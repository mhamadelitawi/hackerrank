import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<Integer>[] ar = new ArrayList[2000004];
		
		
		
		for (int t = 1 ; t <= T ; t++)
		{		
		int x = sc.nextInt() + sc.nextInt();
		if (ar[x]==null)	ar[x] = new ArrayList<>();
			ar[x].add(t);		
		}
		
		
		for (int i = 0 ; i < 2000004 ;i++ )
		{
			if (ar[i] != null)
				for (Integer in : ar[i])
					System.out.print(in+" ");
		}
		
		
		
	}

}