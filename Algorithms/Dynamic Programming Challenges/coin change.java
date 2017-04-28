import java.io.*;
import java.util.*;

public class Solution {
    
    static Map<Coin, Long> map = new HashMap<Coin, Long>();


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int len = scan.nextInt();
        int[] S = new int[len];
        int i = 0;
        while(i < len){
            S[i] = scan.nextInt();
            i++;
        }
        long no = coinChange(S, N);
        System.out.println(no);
    }
    
    public static long coinChange(int[] S, int N){
		if(N < 0){
			return 0;
		}
		if(N==0){
			Coin C = new Coin(S, N);
			map.put(C, 1L);
			return 1;
		}

		if(S.length >= 1){
			int len = S.length;
			int[] S1 = new int[len-1];
			for(int i= 0 ; i < S1.length; i++){
				S1[i] = S[i];
			}
			long c1 ;
			long c2 = 0;
			
			//memoziation
			Coin C1 = new Coin(S1, N);
			Coin C2 = new Coin(S, N-S[len-1]);
			
			if(map.get(C1) != null){
				c1 = map.get(C1);
			}else{
				c1 = coinChange(S1, N);
				map.put(C1, c1);
			}
			if(N-S[len-1] >= 0 ){
				if(map.get(C2) != null){
					c2 = map.get(C2);
				}else{
					c2 = coinChange(S, N-S[len-1]);
					map.put(C2, c2);
				}
			}
			return c1+c2;
		}
		return 0;
	}

}

class Coin{
	int[] S;
	int N;
	
	public Coin(int[] S, int N) {
		this.S = S;
		this.N = N;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + N;
		result = prime * result + Arrays.hashCode(S);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin other = (Coin) obj;
		if (N != other.N)
			return false;
		if (!Arrays.equals(S, other.S))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coin [S=" + Arrays.toString(S) + ", N=" + N + "]";
	}	
}