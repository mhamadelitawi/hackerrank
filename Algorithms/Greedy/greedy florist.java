import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
{

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int A[] = new int[N];
    for (int i = 0; i < N; i++)
        A[i] = sc.nextInt();
    Arrays.sort(A);
    long total = 0, counter = 0, idxCounter = 0;

    while (counter < N) {
        total += A[(int) (N - counter - 1)] * (idxCounter + 1);
        counter++;
        if (counter % K == 0)
            idxCounter++;
    }
    System.out.println(total);
}
}